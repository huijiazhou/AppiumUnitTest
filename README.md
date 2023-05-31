Appium  移动端自动化测试（Android）
 Appium 是一个开源的，适用于原生或混合移动应用（hybrid mobile apps）的自动化测试工具，Appium 应用WebDriver，JSON wire protocol 驱动安卓和iOS应用。
 支持多平台：Android、ios
 支持多语言开发：python java、ruby、js、c#等
 环境准本：
 1、安装Node.js
 2、安装JDK，配置java_home环境变量（jdk1.8）
 3、安装SDK，配置Android——home环境变量
 4、安装Appium
    npm install -g appium
    npm install wd
    appium
    桌面版本：appium-desktop
             appium-inspector
     （免费tips：打开之前运行 xattr -cr "/Applications/Appium Server GUI.app"和"codesign --deep --sign -/Application/Appium\Server\GUI.app",
     否则会报错A JavaScript error occurred un the main process）