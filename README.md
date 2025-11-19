# NoPortal  
**彻底禁止普通玩家点燃下界传送门与末地传送门（仅 OP 豁免）**

一个轻量级 `Paper/Spigot` 插件，已为 `Mohist` 调优，防止非 OP 玩家通过打火石/火焰弹点燃黑曜石或末地传送门框架，同时阻止火焰在黑曜石上蔓延导致意外生成传送门。

A light `Paper/Spigot` plugin and specifically designed for `Mohist`, which aims to prevent nonOp player create Portals to other dimensions.

## 中文

### 插件功能
- 彻底禁止非 OP 玩家点燃下界传送门与末地传送门。
- 阻止火焰在黑曜石上蔓延导致意外生成传送门（防岩浆+火把等套路）。
- 零配置、极轻量、开箱即用。
- 代码使用现代 Java 高级语法编写，优雅且安全。

### 实现原理（简洁版）
1. 监听 `PlayerInteractEvent`：当玩家使用打火石或火焰弹点击黑曜石/末地传送门框架时，若玩家不是 OP 则取消事件。
2. 监听 `BlockIgniteEvent`：当着火的方块是黑曜石时取消火焰蔓延，杜绝一切可能生成传送门的途径。

### 权限节点（可选）
- `noportals.bypass` → 拥有该权限的玩家可以正常点燃传送门（OP 默认拥有）。  
  如果需要对特定玩家/权限组放行，只需给予此节点即可。

### 安装方法
1. 下载最新的 `NoPortal.jar`
2. 放入服务器 `plugins` 文件夹
3. 重启或重载服务器
4. 完成！无需任何配置文件

### 源码地址
完全开源，欢迎 Star & Fork：https://github.com/YourName/NoPortal （请替换为你的实际仓库链接）

### 兼容性
- 支持 Paper / Spigot 1.16.5 - 1.21.x（推荐使用最新版 Paper）
- Java 17+ 编译，充分利用记录、密封类等现代特性（当前代码已保持最大兼容性）

---

## English

### Features
- Completely prevents non-OP players from lighting Nether portals and End portals.
- Blocks fire spread on obsidian that could accidentally create portals.
- Extremely lightweight, zero configuration required.
- Uses clean, modern Java code with null-safety checks.

### How it works
1. Listens to `PlayerInteractEvent` → cancels flint-and-steel / fire charge usage on obsidian or end portal frames for non-OP players.
2. Listens to `BlockIgniteEvent` → cancels fire spread when the igniting block is obsidian (prevents portal creation via lava + fire tricks).

### Permissions
- `noportals.bypass` – Allows a player to light portals (OPs have this by default).  
  (If you want finer control, just add this permission to specific players/groups.)

### Installation
1. Download the latest `NoPortal.jar`.
2. Place it into your server's `plugins/` folder.
3. Restart or reload the server.
4. Done! No configuration files needed.

### Source Code
Fully open source: https://github.com/YourName/NoPortal (or your actual repo link)

---

Made with ❤ by Sudark2  
有问题欢迎提交 Issue 或加群反馈！
