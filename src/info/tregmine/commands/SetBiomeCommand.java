package info.tregmine.commands;

import static org.bukkit.ChatColor.*;

import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;

import info.tregmine.Tregmine;
import info.tregmine.api.TregminePlayer;

public class SetBiomeCommand extends AbstractCommand
{

    public SetBiomeCommand(Tregmine tregmine)
    {
        super(tregmine, "setbiome");
    }

    protected Tregmine plugin;

    protected int x, minX, maxX;
    protected int z, minZ, maxZ;

    @Override
    public boolean handlePlayer(TregminePlayer player, String[] args)
    {
        if (!player.getRank().canSetBiome()) {
            return true;
        }

        Block b1 = player.getFillBlock1();
        Block b2 = player.getFillBlock2();

        if (b1 == null || b2 == null) {
            player.sendMessage(RED + "You must select 2 corners!");
            return true;
        }

        World world = b1.getLocation().getWorld();

        maxX =
                Math.max(b1.getLocation().getBlockX(), b2.getLocation()
                        .getBlockX());
        minX =
                Math.min(b1.getLocation().getBlockX(), b2.getLocation()
                        .getBlockX());
        x = minX;

        maxZ =
                Math.max(b1.getLocation().getBlockZ(), b2.getLocation()
                        .getBlockZ());
        minZ =
                Math.min(b1.getLocation().getBlockZ(), b2.getLocation()
                        .getBlockZ());
        z = minZ;

        if (args.length != 1){
            player.sendMessage(RED + "Correct usage: /setbiome <biome>");
            player.sendMessage(RED + "For a list of availiable biomes type /setbiome help");
            return true;
        }

        if(args[0].equalsIgnoreCase("help")){
            player.sendMessage(GREEN + "Availiable Biomes:");
            player.sendMessage(GRAY + "Beach, Desert, Desert_Hills, Extreme_Hills, Forest, Forest_Hills");
            player.sendMessage(GRAY + "Frozen_Ocean, Frozen_River, Nether, Ice_Mountains, Ice_Plains");
            player.sendMessage(GRAY + "Jungle, Jungle_Hills, Mushroom, Mushroom_Shore, Ocean, Plains");
            player.sendMessage(GRAY + "River, Sky, Small_Mountains, Swamp, Taiga, Taiga_Hills");
        }
        else if(args[0].equalsIgnoreCase("beach")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.BEACH);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("desert")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.DESERT);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("desert_hills") || args[0].equalsIgnoreCase("deserthills")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.DESERT_HILLS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("extreme_hills") || args[0].equalsIgnoreCase("extremehills")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.EXTREME_HILLS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("forest")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.FOREST);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("forest_hills") || args[0].equalsIgnoreCase("foresthills")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.FOREST_HILLS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("frozen_ocean") || args[0].equalsIgnoreCase("frozenocean")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.FROZEN_OCEAN);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("frozen_river") || args[0].equalsIgnoreCase("frozenriver")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.FROZEN_RIVER);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("hell") || args[0].equalsIgnoreCase("nether")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.HELL);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("ice_mountains") || args[0].equalsIgnoreCase("icemountains")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.ICE_MOUNTAINS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("ice_plains") || args[0].equalsIgnoreCase("iceplains")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.ICE_PLAINS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("jungle")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.JUNGLE);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("jungle_hills") || args[0].equalsIgnoreCase("junglehills")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.JUNGLE_HILLS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("mushroom") || args[0].equalsIgnoreCase("mushroom_island") || args[0].equalsIgnoreCase("mushroomisland")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.MUSHROOM_ISLAND);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("mushroom_shore") || args[0].equalsIgnoreCase("mushroomshore")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.MUSHROOM_SHORE);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("ocean") || args[0].equalsIgnoreCase("sea")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.OCEAN);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("plains")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.PLAINS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("river") || args[0].equalsIgnoreCase("lake")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.RIVER);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("sky")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.SKY);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("small_mountains") || args[0].equalsIgnoreCase("smallmountains")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.SMALL_MOUNTAINS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("swampland") || args[0].equalsIgnoreCase("swamp")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.SWAMPLAND);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("taiga")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.TAIGA);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else if(args[0].equalsIgnoreCase("taiga_hills") || args[0].equalsIgnoreCase("taigahills")){
            for(int x = minX; x <= maxX; x++)
            {
                for(int z = minZ; z <= maxZ; z++)
                {
                    world.getBlockAt(x, 0, z).setBiome(Biome.TAIGA_HILLS);
                }
            }
            player.sendMessage(GREEN + "Biome successfully changed!");
        }
        else{
            player.sendMessage(RED + "You specified and invalid biome");
            player.sendMessage(RED + "For a list of availiable biomes type /setbiome help");
        }


        int minChunkX = (int) Math.floor((double) minX / 16);
        int maxChunkX = (int) Math.floor((double) maxX / 16);
        int minChunkZ = (int) Math.floor((double) minZ / 16);
        int maxChunkZ = (int) Math.floor((double) maxZ / 16);

        for(int x = minChunkX; x <= maxChunkX; x++)
        {
            for(int z = minChunkZ; z <= maxChunkZ; z++)
            {
                world.refreshChunk(x, z);
            }
        }

        return true;
    }
}
