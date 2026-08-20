<h1 align="center">ToolStats</h1>

<p align="center">
	<a href="https://modrinth.com/plugin/ToolStats"><img alt="modrinth" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/available/modrinth_vector.svg"></a>
	<a href="https://hangar.papermc.io/hyperdefined/ToolStats"><img alt="hangar" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/available/hangar_vector.svg"></a>
	<a href="https://papermc.io"><img alt="paper" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/supported/paper_vector.svg"></a>
	<a href="https://docs.hyper.lol/plugins/toolstats/about/"><img alt="ghpages" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/documentation/ghpages_vector.svg"></a>
	<a href="https://discord.gg/rJuQXVcJz8"><img alt="discord-singular" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/social/discord-singular_vector.svg"></a>
	<a href="https://buymeacoffee.com/hyperdefined"><img alt="buymeacoffee-singular" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/donate/buymeacoffee-singular_vector.svg"></a>
    <a href="https://patreon.com/hyperdefined"><img alt="patreon-singular" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/donate/patreon-singular_vector.svg"></a>
</p>

ToolStats is a Paper plugin that displays various stats about tools. This plugin is inspired off of [GearStats](https://www.spigotmc.org/resources/gearstats.12960/). You can either track all statistics by default, or a use a token system to add statistics to tool/armor. You can configure how each statistic is shown on the item, or disable it!

Here is everything it tracks:

| Stat               | Items                                           | Trigger                                    |
| ------------------ | ----------------------------------------------- | ------------------------------------------ |
| Arrows shot        | Bow, Crossbow                                   | Shoot an arrow                             |
| Blocks mined       | Axe, Hoe, Pickaxe, Shears, Shovel               | Mine a block                               |
| Critical strikes   | Axe, Mace, Spear, Sword, Trident                | Hit a mob or player with a critical strike |
| Crops harvested    | Hoe                                             | Harvest a crop                             |
| Damage done        | Axe, Bow, Crossbow, Mace, Spear, Sword, Trident | Damage a mob or player                     |
| Damage taken       | Armor, Shield                                   | Take or block damage                       |
| Ender Dragon kills | Axe, Bow, Crossbow, Mace, Spear, Sword, Trident | Kill the Ender Dragon                      |
| Fish caught        | Fishing Rod                                     | Catch a fish                               |
| Flight time        | Elytra                                          | Fly with an elytra                         |
| Logs stripped      | Axe                                             | Strip a log                                |
| Mob kills          | Axe, Bow, Crossbow, Mace, Spear, Sword, Trident | Kill a mob                                 |
| Player kills       | Axe, Bow, Crossbow, Mace, Spear, Sword, Trident | Kill a player                              |
| Sheep sheared      | Shears                                          | Shear a sheep                              |
| Trident thrown     | Trident                                         | Throw a trident                            |
| Wither kills       | Axe, Bow, Crossbow, Mace, Spear, Sword, Trident | Kill a Wither                              |

| Origin  | Trigger                                    |
| ------- | ------------------------------------------ |
| Caught  | Catch a tool while fishing                 |
| Crafted | Craft a tool                               |
| Dropped | Obtain a tool dropped by a killed mob      |
| Found   | Find an elytra in an End Ship              |
| Looted  | Loot a tool from a barrel, chest, or vault |
| Spawned | Spawn a tool in Creative mode              |
| Traded  | Trade for a tool                           |


The best part is, this data is stored on the item itself.

This plugin also has compatibility for:

* [RoseStacker](https://modrinth.com/plugin/rosestacker)

You can see some of the stats below as examples:

| Crafted Origin | Player/Mob Kills | Fish Caught |
|---|---|---|
| ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image2.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image3.png) |

| Sheep Sheared | Dropped By | Damage Taken |
|---|---|---|
| ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image4.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image5.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image6.png) |

| Mob Kills | Elytra | Looted Origin |
|---|---|---|
| ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image7.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image8.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image9.png) |

| Traded Origin | Spawned Origin | Raw NBT Data |
|---|---|---|
| ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image10.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image11.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image12.png) |

| Crops Harvested | Flight Time | Arrows Shot |
|---|---|---|
| ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image13.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image14.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image15.png) |

| Critical Strikes | Trident Throws | Logs Stripped |
|---|---|---|
| ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image16.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image17.png) | ![Image](https://docs.hyper.lol/plugins/toolstats/assets/image18.png) |

## Documentation
Visit the [wiki](https://docs.hyper.lol/plugins/toolstats/about/) for help.

## License
This plugin is released under GNU General Public License v3. See [LICENSE](https://codeberg.org/hyperdefined/ToolStats/src/branch/master/LICENSE).