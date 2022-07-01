# 简介

欢迎使用腾讯课堂开发者工具套件（SDK），此 SDK 是云 API 3.0 平台的配套开发工具。

# 依赖环境

1. Go 1.9 版本及以上（如使用 go mod 需要 Go 1.14）。
2. 部分产品需要在腾讯云控制台开通后，才能正常调用此产品的接口。
3. 在腾讯云控制台 [访问管理](https://console.cloud.tencent.com/cam/capi) 页面获取密钥 SecretID 和 SecretKey，请务必妥善保管，或者使用更安全的临时安全凭证。

# 获取安装

## 通过go get安装

```bash
go get -v -u github.com/tencentoed/openplatform-docs/openapi/sdks/tencentcloud/tcop
```

推荐使用腾讯云镜像加速下载：

1. Linux 或 MacOS:

    ```bash
    export GOPROXY=https://mirrors.tencent.com/go/
    ```

2. Windows:

    ```cmd
    set GOPROXY=https://mirrors.tencent.com/go/
    ```

# 快速开始

每个接口都有一个对应的 Request 结构和一个 Response 结构。例如云服务器的查询实例列表接口 DescribeInstances 有对应的请求结构体 DescribeInstancesRequest 和返回结构体 DescribeInstancesResponse 。

下面以云服务器查询实例列表接口为例，介绍 SDK 的基础用法。

```go
package main

import (
	"crypto/tls"
	"fmt"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/errors"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/profile"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/regions"
	tcop "github.com/tencentoed/openplatform-docs/openapi/sdks/tencentcloud/tcop/v20210810"
	"net/http"
)

func main() {
	// 1.实例化一个认证对象，入参需要传入腾讯云账户密钥对secretId，secretKey。
	credential := common.NewCredential("xxxxx", "xxxxx")
	
	// 2.实例化一个客户端配置对象，可以指定超时时间等配置
    cpf := profile.NewClientProfile()
	cpf.HttpProfile.ReqMethod = "POST"
	cpf.HttpProfile.ReqTimeout = 30
	cpf.HttpProfile.Endpoint = "tcop.tencentcloudapi.com"
	cpf.SignMethod = "TC3-HMAC-SHA256"
	cpf.Language = "en-US"

    // 3.实例化要请求产品(以tcop为例)的client对象
    client, _ := tcop.NewClient(credential, regions.Guangzhou, cpf)
	tr := &http.Transport{
		TLSClientConfig: &tls.Config{InsecureSkipVerify: true},
	}
	client.WithHttpTransport(tr)

	// 4.实例化一个请求对象
	req := tcop.NewDescribeCourseListRequest()
	req.CourseType = common.Int64Ptr(1)
	req.Page = common.Int64Ptr(1)
	req.PageSize = common.Int64Ptr(1)
	
	// 5.通过client对象调用想要访问的接口，需要传入请求对象
	response, err := client.DescribeCourseList(req)
	if err != nil {
		panic(err)
	}
	if _, ok := err.(*errors.TencentCloudSDKError); ok {
		fmt.Printf("An API error has returned: %s", err)
		return
	}
	// 打印返回的json字符串
	fmt.Printf("%s\n", response.ToJsonString())
}
```

# 相关配置

**如无特殊需要，建议您使用默认配置。**

在创建客户端前，如有需要，您可以通过修改`profile.ClientProfile`中字段的值进行一些配置。

```go
// 非必要步骤
// 实例化一个客户端配置对象，可以指定超时时间等配置
cpf := profile.NewClientProfile()
```

具体的配置项说明如下：

## 请求方式

SDK默认使用POST方法。 如果你一定要使用GET方法，可以在这里设置。**GET方法无法处理一些较大的请求**。

```go
cpf.HttpProfile.ReqMethod = "POST"
```

## 超时时间

SDK 有默认的超时时间，如非必要请不要修改默认设置。
如有需要请在代码中查阅以获取最新的默认值。  
单位：秒

```go
cpf.HttpProfile.ReqTimeout = 30
```

## 指定域名

SDK 会自动指定域名。通常是不需要特地指定域名的，但是如果你访问的是金融区的服务，
则必须手动指定域名，例如云服务器的上海金融区域名： tcop.ap-shanghai-fsi.tencentcloudapi.com

```go
cpf.HttpProfile.Endpoint = "tcop.tencentcloudapi.com"
```

## 签名方式

SDK默认用 `TC3-HMAC-SHA256` 进行签名，它更安全但是会轻微降低性能。

```go
cpf.SignMethod = "HmacSHA1"
```

## DEBUG模式

DEBUG模式会打印更详细的日志，当您需要进行详细的排查错误时可以开启。  
默认为 `false`

```go
cpf.Debug = true
```

## 禁用长连接(Keep-alive)

SDK 的每一个 client 默认使用长连接模式，即请求的头部 Connection 字段的值为 keep-alive.

如果您需要使用短连接，可以按照以下方式进行设置：

```go
...
    client, _ := tcop.NewClient(credential, regions.Guangzhou, cpf)
    tp := &http.Transport{
        DisableKeepAlives: true,
    }
    client.WithHttpTransport(tp)
...
```

则此 client 发出的每个请求头部的 Connection 字段的值为 close

## 代理

如果是有代理的环境下，需要设置系统环境变量 `https_proxy` ，否则可能无法正常调用，抛出连接超时的异常。或者自定义 Transport 指定代理，通过 client.WithHttpTransport 覆盖默认配置。

# 错误处理

从 `v1.0.181` 开始，腾讯云 GO SDK 会将各个产品的返回的错误码定义为常量，您可以直接调用处理，无需手动定义。如果您使用 IDE (如 Goland )进行开发，可以使用他们的代码提示功能直接选择。例如：

```go
...//Your other go code

// Handling errors
response, err := client.DescribeInstances(request)
if terr, ok := err.(*errors.TencentCloudSDKError); ok {
    code := terr.GetCode()
    if code == tcop.FAILEDOPERATION_CDKEYALREADYUSED{
        fmt.Printf("Handling error: FailedOperation.CdKeyAlreadyUsed,%s", err)
    }else if code == tcop.FAILEDOPERATION_CDKEYEXPIREDINVALID{
        fmt.Printf("Handling error: FailedOperation.CdKeyExpiredInvalid,%s", err)
    }else{
        fmt.Printf("An API error has returned: %s", err)
    }
    return
}
...
```

同时，各个接口函数的注释部分也列出了此接口可能会返回的错误码，方便您进行处理：

```go
// DescribeInstances
// 本接口 (DescribeInstances) 用于查询一个或多个实例的详细信息。
//
// 
//
// * 可以根据实例`ID`、实例名称或者实例计费模式等信息来查询实例的详细信息。过滤信息详细请见过滤器`Filter`。
//
// * 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的实例。
//
// * 支持查询实例的最新操作（LatestOperation）以及最新操作状态(LatestOperationState)。
//
// 可能返回的错误码:
//  FAILEDOPERATION_ILLEGALTAGKEY = "FailedOperation.IllegalTagKey"
//  FAILEDOPERATION_ILLEGALTAGVALUE = "FailedOperation.IllegalTagValue"
//  FAILEDOPERATION_TAGKEYRESERVED = "FailedOperation.TagKeyReserved"
//  INTERNALSERVERERROR = "InternalServerError"
//  INVALIDFILTER = "InvalidFilter"
//  INVALIDFILTERVALUE_LIMITEXCEEDED = "InvalidFilterValue.LimitExceeded"
//  INVALIDHOSTID_MALFORMED = "InvalidHostId.Malformed"
//  INVALIDINSTANCEID_MALFORMED = "InvalidInstanceId.Malformed"
//  INVALIDPARAMETER = "InvalidParameter"
//  INVALIDPARAMETERVALUE = "InvalidParameterValue"
//  INVALIDPARAMETERVALUE_IPADDRESSMALFORMED = "InvalidParameterValue.IPAddressMalformed"
//  INVALIDPARAMETERVALUE_INVALIDIPFORMAT = "InvalidParameterValue.InvalidIpFormat"
//  INVALIDPARAMETERVALUE_INVALIDVAGUENAME = "InvalidParameterValue.InvalidVagueName"
//  INVALIDPARAMETERVALUE_LIMITEXCEEDED = "InvalidParameterValue.LimitExceeded"
//  INVALIDPARAMETERVALUE_SUBNETIDMALFORMED = "InvalidParameterValue.SubnetIdMalformed"
//  INVALIDPARAMETERVALUE_TAGKEYNOTFOUND = "InvalidParameterValue.TagKeyNotFound"
//  INVALIDPARAMETERVALUE_VPCIDMALFORMED = "InvalidParameterValue.VpcIdMalformed"
//  INVALIDSECURITYGROUPID_NOTFOUND = "InvalidSecurityGroupId.NotFound"
//  INVALIDSGID_MALFORMED = "InvalidSgId.Malformed"
//  INVALIDZONE_MISMATCHREGION = "InvalidZone.MismatchRegion"
//  RESOURCENOTFOUND_HPCCLUSTER = "ResourceNotFound.HpcCluster"
//  UNAUTHORIZEDOPERATION_INVALIDTOKEN = "UnauthorizedOperation.InvalidToken"
func (c *Client) DescribeInstances(request *DescribeInstancesRequest) (response *DescribeInstancesResponse, err error){
    ...
}
```
