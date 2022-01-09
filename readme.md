# MineGenshin

![](/screenshots/Genshin%20Preview.jpg)
使 Minecraft 更加 Genshin Impact 化

---

## 我们修改了什么

- 一个 Minecraft 资源包,设置了主菜单的背景音乐和游戏字体
- 一个第三方模组的配置文件,将原生主菜单样式修改为原神风格

## 版本与依赖

- Minecraft 1.17.1 (理论上 它应该通用 1.13+的所有版本)
- Fabric
- [Mod Menu](https://www.curseforge.com/minecraft/mc-mods/modmenu)
- ['Slight' Gui Modifications](https://www.curseforge.com/minecraft/mc-mods/slight-gui-modifications) 及其附属依赖

## 安装

1. 安装上述依赖并确保游戏可以正常启动
2. 退出游戏
3. 将`resourcepacks/Genshin Impact Resourcepack`复制进您的资源包文件夹(resourcepacks)
4. 将`config/slightguimodifications`替换进您的模组配置文件夹(config)
5. 启动游戏, Enjoy it!

## 版本兼容性

| Mod Name                   | Min Version | Max Version |
| -------------------------- | ----------- | ----------- |
| Mod Menu                   | 1.16.5      | ~           |
| 'Slight' Gui Modifications | 1.15.x      | ~           |

### 修改资源包版本
你可以通过修改一些参数,来使资源包适合您的Minecraft版本  
将 `pack.mcmeta` 中 `pack_format` 键的值修改为对应版本, 参见 [Wiki](https://minecraft.fandom.com/zh/wiki/%E6%95%99%E7%A8%8B/%E5%88%B6%E4%BD%9C%E8%B5%84%E6%BA%90%E5%8C%85#pack_format)  
> Tips: 本项目使用的 TrueType 字体仅适用于 Minecraft 1.13-pre7 以上的版本, 参见 [森罗万象](http://sqwatermark.com/resguide/vanilla/font/font.html#%E5%88%B6%E4%BD%9C%E5%AD%97%E4%BD%93%E8%B5%84%E6%BA%90%E5%8C%85)

## TODOs

[ ] 替换游戏内背景音乐  
[ ] And more!

## 关于版权

本项目禁止商业用途  
素材文件版权归米哈游所有
