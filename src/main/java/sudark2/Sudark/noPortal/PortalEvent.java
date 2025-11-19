package sudark2.Sudark.noPortal;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class PortalEvent implements Listener {

    @EventHandler
    public void onPortal(PlayerInteractEvent event) {
        Player pl = event.getPlayer();
        Material material = pl.getItemInHand().getType();
        Block bl = event.getClickedBlock();
        if (bl == null) return;
        Material tarMaterial = bl.getType();
        if (
                (material == Material.FLINT_AND_STEEL || material == Material.FIRE_CHARGE)
                        &&
                        (tarMaterial == Material.OBSIDIAN || tarMaterial == Material.END_PORTAL_FRAME)
        ) {
            if (!pl.isOp()) event.setCancelled(true);
        }
    }

    @EventHandler
    public void onFireSpread(BlockIgniteEvent event) {
        Block bl = event.getIgnitingBlock();
        if (bl == null) return;
        Material material = bl.getType();
        if (material == Material.OBSIDIAN) event.setCancelled(true);
    }
}
