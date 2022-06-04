# 个人信息

 - 易庞宙/男/1993
 - 本科/桂林电子科技大学（专升本全日制 2016.09-2018.07）计算机科学与技术
 - 大专/广西英华国际职业学院 （2013.09-2016.07）               软件技术                                          
 - 工作年限：3-5年
 - 技术博客：[https://blog.csdn.net/qq_29856589](https://blog.csdn.net/qq_29856589)
 - Github：[https://github.com/KilleTom](https://github.com/KilleTom)
 - 期望职位：Android开发工程师
 - 期望薪资：税前月薪23k~26k
 - 期望城市：广州，特别喜欢的公司可例外
# 联系方式
| 手机        | Email                  | 微信    | QQ         |
| ----------- | ---------------------- | ------- | ---------- |
| 13360704039 | luckyrookie.ypz@qq.com | JTR-Ypz | 1986545332 |

# 工作经历

## 广州极飞科技有限公司 （ 2019年6月 ~ 2022年6月 ）

### XAPC3.0App&智能农机App

XAPC3.0App中负责开发维护迭代功能

智能农机App中前期主要负责智能农机App搭建及可行性功能的探讨，该App为公司未来智能农机主力App之一

#### 技术点

- 利用JetPack中Lifecyle去封装公用组件库：二维码扫码库、优化输入法隐藏、自定义View动画绑定
- 结合二次封装MapBox框架替换现有OSMAndroid地图框架
- 结合二次封装MapBox框架实现：地图打点、多设备作业展示、同步极飞农服地块展示规则等
- 结合硬件SDK实现：政府演示功能一控多机、地图打点、设备作业、农机参数修改、农机作业、远程协助
- 结合Android中MaterialDesign风格优化一些视觉交互优化：登录页面交互优化重构、设备详细基本信息列表优化等

### XSASApp

这是一个智能农业App，目的在于闭合公司生态圈。前期担任了主要开发角色及部分主导职责。

#### 技术点

- 利用二次封装MapBox框架结合二次封装GEO框架实现以下效果：
  - 实现类似高德地图的一个地图可以全局使用的一个功能
  - 参考结合谷歌地图打点测绘交互方式，在地图实现一个地图测绘，创建地块、标记物等
  - 接入IOT功能配合ACS实现精确RTK打点
- 对物理几何数据进行检测判断例如相关、膨胀、合并等
  
- 基于平台网络API结合Retrofit+OkHttp+GSON建立网络请求基本库：
  - 网络请求中统一拦截异常信息譬如用户Token失效然后实现重登录逻辑
  - 网络请求统一处理返回Body的安全性校验

- 基于Activity及Fragment结合业务进行二次封装：
  - 譬如一个Activity下如何让多个Fragment通过接口的方式去调用MapBox
  - 譬如通过网络请求感知是否需要重登录或跳转到特定的页面

## 广州搜床科技有限公司 （ 2018年8月 ~ 2019年6月 ）
### XBEDXMSTools
酒店到店自助办理入住，搜床科技产品生态链的其中一款App
#### 技术点
- RetrofitClient根据自己现有github库以及后台阿里云网关返回的数据模型二次封装
- KilleTomRxMaterialDesignUtil自己现有githubUi库
- 华视电子蓝牙读卡器JAR二次封装采用RxJava2+IPC[AIDL]用来读取身份证实现设备重连重试及读取等
- Glide图片优化加载、sw适配方式进行屏幕适配、svg图片适配减少apk包容量

### 其他项目

- XbedApp：负责酒店预订房间、下订单、办理入住退房等功能，搜床科技有限公司产品生态链的其中一款App，负责该App日常运维以及小功能开发，目前该App准备废弃重构。
- 丽家汇App：负责将清洁酒店的房间，搜床科技有限公司产品生态链的其中一款App，通过搜床科技产品办理入住的，最后退房，房间状态都会置脏，然后生成清洁单让相应人员接单搞清洁，类似美团外卖接单。负责该App日常运维以及小功能开发，目前该App准备废弃重构。

## 海南曼迪科技有限公司 （ 2017年12月 ~ 2018年2月 ）
由于公司运营决策问题，拖欠薪酬而离职
### 享宝乐园App 
一款学前教育音频类App。
#### 技术点
- 使用java和Kotlin混编开发并配合使用DataBinding实现业务数据及业务数据的解耦

- 使用MaterialDesign风格及开源控件去优化产品交互

- 使用EventBus解决需要响应的功能如音乐服务的业务需求、回调线程数据需求;

- 使用百分比布局UI设配;

- 使用Retrofit和Okhttp+Gson去解决网络请求;

- 使用微信原生SDK实现微信登陆分享支付等;

- 使用腾讯buggly统计bug定位bug发生代码所在区域以进行代码修复;

# 技能清单

- 掌握GEO框架及MapBox框架、OSMAndroid用来做地图上的几何相关的交互以及几何数据一些检测
- 掌握使用JetPack常用的组件：Lifecyle、Room、LiveData、ViewModel
- 熟悉使用一些常用第三方框架：Glide、Fresco、Retrofit、OkHttp、GSON、RxJava、EventBus、协程、lottie、buggly、protobuf等
- 熟悉使用微信原生SDK实现微信登陆分享支付
- 掌握使用MVVM、MVP去对业务进行解耦
- 掌握如何优化资源文件：svg图片替代一些资源文件、APK打包去除多余资源文件等
- 熟悉使用AIDL及Android序列化的配合使用
- 会使用阿里热更新与腾讯buggly的相互使用实现在线修复AppBug或在线更新App

# 书籍、开源项目、博客文章

- [Kotlin进阶实战](https://baike.baidu.com/item/Kotlin%E8%BF%9B%E9%98%B6%E5%AE%9E%E6%88%98)
  - https://baike.baidu.com/item/Kotlin%E8%BF%9B%E9%98%B6%E5%AE%9E%E6%88%98
  - Kotlin进阶实战第二作者，出版社：清华大学出版社。主要负责该书内Android相关的技术编写
- [RxTask](https://github.com/KilleTom/RxTask)
  - https://github.com/KilleTom/RxTask
  - 利用RxJava3结合kotlin特性实现前后端异步通信库
- [玩转RxJava3，领略设计之美](https://blog.csdn.net/qq_29856589/article/details/121031029)
  - https://blog.csdn.net/qq_29856589/article/details/121031029
  - 主要讲解RxTask的设计思路及如何兼容前后端，目前被鸿洋公众号收录
- [玩转RxJava3，领略设计之美](https://blog.csdn.net/qq_29856589/article/details/121031029)
  - https://blog.csdn.net/qq_29856589/article/details/121031029
  -   主要讲解RxTask的设计思路及如何兼容前后端，目前被鸿洋公众号收录
- [AndroidJetPack中Lifecycle原理和机制](https://blog.csdn.net/qq_29856589/article/details/125025154?spm=1001.2014.3001.5502)
  - https://blog.csdn.net/qq_29856589/article/details/125025154
  -   通过源码剖解Lifecycle原理实现。目前投稿鸿洋公众号通过待发布
- [闲谈针对JetPack搭配设计模式构建一个简易通用的MVVM](https://blog.csdn.net/qq_29856589/article/details/124915153)
  - https://blog.csdn.net/qq_29856589/article/details/124915153
  -   利用JetPack技术如何优化MVVM的一种方式。目前投稿鸿洋公众号通过待发布
- [微信二次封装库：RxWechatToolsMaster](https://github.com/KilleTom/RxWechatToolsMaster)
  - https://github.com/KilleTom/RxWechatToolsMaster
  - 分别为Tools和Client两个工具库，Tools针对于不需要登录支付，只需要简单分享图片网页以及视频等一些封装，避免图片分享产生图片过大的适当压缩图片分享；Client基于Tools针对需要登陆支付等封装，通过实现接口即可实现其回调。
- [基于Android5.0以上的网络状态监听回调](https://github.com/KilleTom/RxNetworkClientDemo)
  - https://github.com/KilleTom/RxNetworkClientDemo
  -   主要目的在于实时监听Android当前状态变化，针对其变化简易的回调。
- [刘海屏适配工具库](https://github.com/KilleTom/BangScreenToolsMaster)
  - https://github.com/KilleTom/BangScreenToolsMaster
  -   通过使用该库简易的适配刘海屏

# 致谢
感谢您花时间阅读我的简历，期待能有机会和您共事。
