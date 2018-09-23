# WeChatEnterprise
WeChatEnterprise微信企业号开发框架，Java编写懒人式一键部署项目

# CSDN Blog URL
https://blog.csdn.net/jspping/article/details/82784790

# Feedback URL
https://blog.csdn.net/jspping/article/details/82784790

# Sina 
https://weibo.com/3234181164/profile?topnav=1&wvr=6&is_all=1

# Tips
如果你觉得博主写的代码框架不错并且对你的开发有帮助，请在GitHub的WeChatEnterprise仓库页面的右上角点击“Star”，对我的技术分享进行支持，将是我最大的动力，博主会继续分享更多优质的资源给大家。

# About WeChatEnterprise		
关于懒人式的开发框架WeChatEnterprise的正确使用：

①首先要确保你的服务器已经搭建好，然后替换微信官方提供解决java.security.InvalidKeyException:illegal Key Size异常的jar包。

jar下载地址：http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html，下载后解压，可以看到local_policy.jar和US_export_policy.jar以及readme.txt。
如果安装了JRE，将两个jar文件放到%JRE_HOME% \lib\security目录下覆盖原来的文件。如果安装了JDK，将两个jar文件放到%JDK_HOME%\jre\lib\security目录下覆盖原来文件。

②从博主的GitHub上clone或下载框架代码，导入到开发工具，找到wx.api.WXApi类，将其中的Token、EncodingAesKey、CorpId、Secret参数全部填上自己实际开发的参数然后保存，注意Token、EncodingAesKey参数可到企业号后台随机生成也可自定义，但必须要两端参数完全一致。

开发工具下载地址：http://www.engineer-jsp.cn/download/tools/tools.rar

③在开发工具中编译之前导入修改参数后的WeChatEnterprise 框架源码，并部署到你的服务器。随后进入到微信企业后台，单击“应用与小程序”选项，进入页面后，单击左侧“应用”选项，找到“自建”选项，单击你要开启API接收的自建应用，单击要开启API接收的自建应用后，进入到自建应用的详细页面，找到“接收消息”选项，单击“设置API接收”选项，进入到API接收消息页面，将随机生成或自定义的Token、EncodingAesKey一并填写在开启API接收消息的web页面内对应的方框。注意，此时填写的Token、EncodingAesKey必须要与WeChatEnterprise 框架源代码下wx.api.WXApi类的Token、EncodingAesKey完全保持一致，否则会一直验证失败。接下来在给大家介绍URL参数填写，这里默认填写http://你的服务器地址或域名地址/WeChatEnterprise/coreServlet，如果需要修改地址的组成，可以修改服务器的项目root目录，也就是你服务器默认访问的那个项目的首页面，servlet名称可修改WeChatEnterprise 框架源码下的WebRoot/WEB-INF/web.xml里servlet-mapping节点的子节点url-pattern，反正最终这个路径一定是外网下可以被访问到的，否则也是会一直提示验证失败。

④完成以上步骤之后，你离成功部署项目只差一步之遥了，在单击“保存”按钮之前，默认不勾选上报地理位置、上报进入应用事件，博主也不建议勾选，因为勾选后每次进入应用都要提示，很烦人，确认是否勾选之后单击“保存”按钮即可完成开启API接收，进行后续的消息收发、自定义菜单等接口的操作，部署项目至此就成功了。

接下来继续给大家介绍WeChatEnterprise 框架的使用以及核心类的解读。

# wx.servlet.WXCoreServlet
wx.servlet.WXCoreServlet核心类，WeChatEnterprise框架的消息出入口

再部署成功之后，所有的消息请求与收发都在wx.servlet.WXCoreServlet类，这个类将收到的消息进行校验，校验成功之后在解密，解密成功后将协议进行层级分发。该类也是消息的出口，对发送和响应出去的消息进行加密发送。

wx.protocol.WXProtocolManager核心类，WeChatEnterprise框架的消息解析、管理、分发等

# wx.protocol.WXProtocolManager类

在成功收到消息之后，wx.protocol.WXProtocolManager类首先对消息进行解析，数据无误之后将会对协议进行分发，依据消息类型将协议划分为WXTextProtocol、WXImageProtocol、WXVoiceProtocol、WXVideoProtocol、WXLocationProtocol、WXLinkProtocol、WXEventProtocol七大协议场景，即文本协议、图片协议、语音协议、视频协议、位置协议、链接协议、事件协议，其中事件协议WXEventProtocol下又进行了多层级的事件分发。七大协议场景继承自WeChatEnterprise框架的wx.protocol.WXBaseProtocol基础协议，也最终将响应的消息交由wx.protocol.WXBaseProtocol基础协议通过wx.protocol.WXProtocolManager类响应给wx.servlet.WXCoreServlet核心类，wx.servlet.WXCoreServlet核心类再将响应的消息进行加密并发送出去。

在wx.protocol.WXProtocolManager类协议分发的7大场景下，当某个场景所执行的流程全部完成后，由wx.protocol.WXBaseProtocol基础协议类releasProtocol方法将该场景释放，标志下一场景的开始。

上述都是WeChatEnterprise框架最最核心的部分，其他部分都是独立开来的，是开发者主动调用并发送消息给关注者。

接下来具体介绍WeChatEnterprise框架各个包的具体功能：

# About Package

package wx.api

                       ------ 定义了框架的全局常量、全局变量 ：请求地址、Token、EncodingAesKey、CorpId、Secret、获取凭证、封装code请求地址等

package wx.app

                       ------ 应用管理 ：获取应用、设置应用、获取应用列表

package wx.contact

                       ------ 通讯录管理 ：成员管理、部门管理、标签管理

                               1.成员管理 ：创建成员、读取(获取)成员、更新成员、删除成员、批量删除成员、获取部门成员、获取部门成员详情、userid to openid、openid to userid、二次验证、邀请成员、获取外部联系人详情

                                2.部门管理 ：创建部门、更新部门、删除部门、获取部门列表

                               3.标签管理 ：创建标签、更新标签名字、删除标签、获取标签成员、增加标签成员、删除标签成员、获取标签列表

package wx.encryption

                       ------ 消息的加解密校验、请求校验

package wx.media 

                       ------ 素材管理 ： 上传临时素材、获取临时素材、上传图片

package wx.menu

                       ------ 自定义菜单 ------ 创建菜单、获取菜单、删除菜单

package wx.msg

                       ------ 基础消息单元类 ：文件、照片、MpNews、News、Text、TextCard、Video、Voice

package wx.msg.chat.group

                       ------ 群聊 ：创建群聊、修改群聊、获取群聊会话

package wx.msg.push

                     ------- 消息推送：推送文本消息、推送图片消息、推送语音消息、推送视频消息、推送文件消息、推送文本卡片消息、推送news图文消息、推送mpnews消息

package wx.msg.req 

                      ------ 发送(请求)消息：发送文本消息、发送图片消息、发送语音消息、发送视频消息、发送文件消息、发送文本卡片消息、发送news图文消息、发送mpnews消息

package wx.msg.resp

                      ------ 被动响应(response) ：响应文本消息、响应音乐消息、响应图片消息、响应音频消息、响应视频消息、响应图文消息

package wx.oauth2 

                       ------ 授权：code换取成员信息、user_ticket换取用户信息

package wx.protocol

                       ------ 协议核心 ：协议解析、协议管理、协议分发、协议划分为7大场景、协议层级下发等

package wx.servlet

                       ------ 请求响应入口 ： 消息的请求与响应、二次验证、授权登陆、重定向等

package wx.util

                       ------ 工具包 ： IO异步与同步阻塞网络请求、核心消息工具类、线程池管理等