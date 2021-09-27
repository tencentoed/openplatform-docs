package main

import (
	tcop "../../../tencentcloud/tcop/v20210810"
	"crypto/tls"
	"fmt"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/errors"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/profile"
	"github.com/tencentcloud/tencentcloud-sdk-go/tencentcloud/common/regions"
	"net/http"
)

func main() {
	// 必要步骤：
	// 实例化一个认证对象，入参需要传入腾讯云账户密钥对secretId，secretKey。
	// 你也可以直接在代码中写死密钥对，但是小心不要将代码复制、上传或者分享给他人，
	// 以免泄露密钥对危及你的财产安全。
	credential := common.NewCredential("*****", "*****")
	// 非必要步骤
	// 实例化一个客户端配置对象，可以指定超时时间等配置
	cpf := profile.NewClientProfile()
	// SDK默认使用POST方法。
	// 如果你一定要使用GET方法，可以在这里设置。GET方法无法处理一些较大的请求。
	// 如非必要请不要修改默认设置。
	cpf.HttpProfile.ReqMethod = "POST"
	// SDK有默认的超时时间，如非必要请不要修改默认设置。
	// 如有需要请在代码中查阅以获取最新的默认值。
	cpf.HttpProfile.ReqTimeout = 30
	// SDK会自动指定域名。通常是不需要特地指定域名的，但是如果你访问的是金融区的服务，
	// 则必须手动指定域名，例如云服务器的上海金融区域名： tcop.ap-shanghai-fsi.tencentcloudapi.com
	cpf.HttpProfile.Endpoint = "tcop.tencentcloudapi.com"
	// #测试环境
	// SDK默认用TC3-HMAC-SHA256进行签名，它更安全但是会轻微降低性能。
	// 如非必要请不要修改默认设置。
	cpf.SignMethod = "TC3-HMAC-SHA256"
	// SDK 默认用 zh-CN 调用返回中文。此外还可以设置 en-US 返回全英文。
	// 但大部分产品或接口并不支持全英文的返回。
	// 如非必要请不要修改默认设置。
	cpf.Language = "en-US"
	// cpf.Debug = true

	// 实例化要请求产品(以cvm为例)的client对象
	// 第二个参数是地域信息，可以直接填写字符串ap-guangzhou，或者引用预设的常量
	client, _ := tcop.NewClient(credential, regions.Guangzhou, cpf)
	// 实例化一个请求对象，根据调用的接口和实际情况，可以进一步设置请求参数
	// 你可以直接查询SDK源码确定DescribeInstancesRequest有哪些属性可以设置，
	// 属性可能是基本类型，也可能引用了另一个数据结构。
	// 推荐使用IDE进行开发，可以方便的跳转查阅各个接口和数据结构的文档说明。
	tr := &http.Transport{
		TLSClientConfig: &tls.Config{InsecureSkipVerify: true},
	}
	client.WithHttpTransport(tr)

	//创建接口 有上限制
	BuildCreateLiveCourseRequest(client)


}

//{"Response":{"TermId":"103736968","LiveUrl":"https://ke.qq.com/webcourse/3593829/103736968#taid=11416912134592101\u0026lite=1","RequestId":"1de01494-05e8-428a-9669-e986d92047a9"}}
func BuildCreateLiveCourseRequest(client *tcop.Client) {
	request := tcop.NewCreateLiveCourseRequest()
	// 基本类型的设置。
	// 此接口允许设置返回的实例数量。此处指定为只返回一个。
	// SDK采用的是指针风格指定参数，即使对于基本类型你也需要用指针来对参数赋值。
	// SDK提供对基本类型的指针引用封装函数
	request.IdaasOrgId = common.StringPtr("tn-c65190017f394836863e83ca429b501c")
	request.TeacherId = common.StringPtr("2107052")
	request.Name = common.StringPtr("云api测试课程勿删") // 这个名称
	request.VisibleScope = common.Int64Ptr(0)

	// 数组类型的设置。
	// 此接口允许指定实例 ID 进行过滤，但是由于和接下来要演示的 Filter 参数冲突，先注释掉。
	// request.InstanceIds = common.StringPtrs([]string{"ins-r8hr2upy"})
	//IdaasOrgId=tn-c65190017f394836863e83ca429b500c&TeacherId=2007051&VisibleScope=0&Name=moon
	// 复杂对象的设置。
	// 在这个接口中，Filters是数组，数组的元素是复杂对象Filter，Filter的成员Values是string数组。

	// 通过client对象调用想要访问的接口，需要传入请求对象
	response, err := client.CreateLiveCourse(request)
	// 处理异常
	if _, ok := err.(*errors.TencentCloudSDKError); ok {
		fmt.Printf("An API error has returned: %s", err)
		return
	}
	// 非SDK异常，直接失败。实际代码中可以加入其他的处理。
	if err != nil {
		panic(err)
	}
	// 打印返回的json字符串
	fmt.Printf("%s\n", response.ToJsonString())
}
