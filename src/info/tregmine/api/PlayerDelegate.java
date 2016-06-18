// Generated by delegate_gen on Mon Jan 13 09:30:38 CET 2014
package info.tregmine.api;

import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.entity.Player.Spigot;

import info.tregmine.Tregmine;
import net.md_5.bungee.api.chat.BaseComponent;
import net.minecraft.server.v1_10_R1.EntityPlayer;
import net.minecraft.server.v1_10_R1.PacketPlayOutChat;

public abstract class PlayerDelegate {
	private org.bukkit.entity.Player delegate;

	protected PlayerDelegate(org.bukkit.entity.Player d) {
		this.delegate = d;
	}

	public void abandonConversation(org.bukkit.conversations.Conversation p0) {
		checkState();
		delegate.abandonConversation(p0);
	}

	public void abandonConversation(org.bukkit.conversations.Conversation p0,
			org.bukkit.conversations.ConversationAbandonedEvent p1) {
		checkState();
		delegate.abandonConversation(p0, p1);
	}

	public void acceptConversationInput(java.lang.String p0) {
		checkState();
		delegate.acceptConversationInput(p0);
	}

	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0) {
		checkState();
		return delegate.addAttachment(p0);
	}

	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0, int p1) {
		checkState();
		return delegate.addAttachment(p0, p1);
	}

	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0, java.lang.String p1,
			boolean p2) {
		checkState();
		return delegate.addAttachment(p0, p1, p2);
	}

	public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0, java.lang.String p1,
			boolean p2, int p3) {
		checkState();
		return delegate.addAttachment(p0, p1, p2, p3);
	}

	public boolean addPotionEffect(org.bukkit.potion.PotionEffect p0) {
		checkState();
		return delegate.addPotionEffect(p0);
	}

	public boolean addPotionEffect(org.bukkit.potion.PotionEffect p0, boolean p1) {
		checkState();
		return delegate.addPotionEffect(p0, p1);
	}

	public boolean addPotionEffects(java.util.Collection<org.bukkit.potion.PotionEffect> p0) {
		checkState();
		return delegate.addPotionEffects(p0);
	}

	public void awardAchievement(org.bukkit.Achievement p0) {
		checkState();
		delegate.awardAchievement(p0);
	}

	public boolean beginConversation(org.bukkit.conversations.Conversation p0) {
		checkState();
		return delegate.beginConversation(p0);
	}

	public boolean canSee(org.bukkit.entity.Player p0) {
		checkState();
		return delegate.canSee(p0);
	}

	public void chat(java.lang.String p0) {
		checkState();
		delegate.chat(p0);
	}

	private void checkState() {
		if (delegate == null) {
			throw new IllegalStateException("Can't be used when delegate isn't set.");
		}
	}

	public void closeInventory() {
		checkState();
		delegate.closeInventory();
	}

	public CraftPlayer craftPlayer() {
		checkState();
		return (CraftPlayer) delegate;
	}

	public void damage(double p0) {
		checkState();
		delegate.damage(p0);
	}

	public void damage(double p0, org.bukkit.entity.Entity p1) {
		checkState();
		delegate.damage(p0, p1);
	}

	public boolean eject() {
		checkState();
		return delegate.eject();
	}

	public java.util.Collection<org.bukkit.potion.PotionEffect> getActivePotionEffects() {
		checkState();
		return delegate.getActivePotionEffects();
	}

	public java.net.InetSocketAddress getAddress() {
		checkState();
		return delegate.getAddress();
	}

	public boolean getAllowFlight() {
		checkState();
		return delegate.getAllowFlight();
	}

	public org.bukkit.Location getBedSpawnLocation() {
		checkState();
		return delegate.getBedSpawnLocation();
	}

	public boolean getCanPickupItems() {
		checkState();
		return delegate.getCanPickupItems();
	}

	public org.bukkit.Location getCompassTarget() {
		checkState();
		return delegate.getCompassTarget();
	}

	public java.lang.String getCustomName() {
		checkState();
		return delegate.getCustomName();
	}

	public org.bukkit.entity.Player getDelegate() {
		return delegate;
	}

	public java.lang.String getDisplayName() {
		checkState();
		return delegate.getDisplayName();
	}

	public java.util.Set<org.bukkit.permissions.PermissionAttachmentInfo> getEffectivePermissions() {
		checkState();
		return delegate.getEffectivePermissions();
	}

	public org.bukkit.inventory.Inventory getEnderChest() {
		checkState();
		return delegate.getEnderChest();
	}

	public int getEntityId() {
		checkState();
		return delegate.getEntityId();
	}

	public org.bukkit.inventory.EntityEquipment getEquipment() {
		checkState();
		return delegate.getEquipment();
	}

	public float getExhaustion() {
		checkState();
		return delegate.getExhaustion();
	}

	public float getExp() {
		checkState();
		return delegate.getExp();
	}

	public int getExpToLevel() {
		checkState();
		return delegate.getExpToLevel();
	}

	public double getEyeHeight() {
		checkState();
		return delegate.getEyeHeight();
	}

	public double getEyeHeight(boolean p0) {
		checkState();
		return delegate.getEyeHeight(p0);
	}

	public org.bukkit.Location getEyeLocation() {
		checkState();
		return delegate.getEyeLocation();
	}

	public float getFallDistance() {
		checkState();
		return delegate.getFallDistance();
	}

	public int getFireTicks() {
		checkState();
		return delegate.getFireTicks();
	}

	public long getFirstPlayed() {
		checkState();
		return delegate.getFirstPlayed();
	}

	public float getFlySpeed() {
		checkState();
		return delegate.getFlySpeed();
	}

	public int getFoodLevel() {
		checkState();
		return delegate.getFoodLevel();
	}

	public org.bukkit.GameMode getGameMode() {
		checkState();
		return delegate.getGameMode();
	}

	public EntityPlayer getHandle() {
		checkState();
		return craftPlayer().getHandle();
	}

	public double getHealth() {
		checkState();
		return delegate.getHealth();
	}

	public double getHealthScale() {
		checkState();
		return delegate.getHealthScale();
	}

	public org.bukkit.inventory.PlayerInventory getInventory() {
		checkState();
		return delegate.getInventory();
	}
	
	public org.bukkit.inventory.ItemStack getItemInHand() {
		checkState();
		return delegate.getEquipment().getItemInMainHand();
	}
	
	

	public org.bukkit.inventory.ItemStack getItemOnCursor() {
		checkState();
		return delegate.getItemOnCursor();
	}

	public org.bukkit.entity.Player getKiller() {
		checkState();
		return delegate.getKiller();
	}

	public double getLastDamage() {
		checkState();
		return delegate.getLastDamage();
	}

	public org.bukkit.event.entity.EntityDamageEvent getLastDamageCause() {
		checkState();
		return delegate.getLastDamageCause();
	}

	public long getLastPlayed() {
		checkState();
		return delegate.getLastPlayed();
	}

	public org.bukkit.entity.Entity getLeashHolder() {
		checkState();
		return delegate.getLeashHolder();
	}

	public int getLevel() {
		checkState();
		return delegate.getLevel();
	}

	public java.util.Set<java.lang.String> getListeningPluginChannels() {
		checkState();
		return delegate.getListeningPluginChannels();
	}

	public org.bukkit.Location getLocation() {
		checkState();
		return delegate.getLocation();
	}

	public org.bukkit.Location getLocation(org.bukkit.Location p0) {
		checkState();
		return delegate.getLocation(p0);
	}

	public int getMaxFireTicks() {
		checkState();
		return delegate.getMaxFireTicks();
	}

	public double getMaxHealth() {
		checkState();
		return delegate.getMaxHealth();
	}

	public int getMaximumAir() {
		checkState();
		return delegate.getMaximumAir();
	}

	public int getMaximumNoDamageTicks() {
		checkState();
		return delegate.getMaximumNoDamageTicks();
	}

	public java.util.List<org.bukkit.metadata.MetadataValue> getMetadata(java.lang.String p0) {
		checkState();
		return delegate.getMetadata(p0);
	}

	public java.lang.String getName() {
		checkState();
		return delegate.getName();
	}

	public java.util.List<org.bukkit.entity.Entity> getNearbyEntities(double p0, double p1, double p2) {
		checkState();
		return delegate.getNearbyEntities(p0, p1, p2);
	}

	public int getNoDamageTicks() {
		checkState();
		return delegate.getNoDamageTicks();
	}

	public org.bukkit.inventory.InventoryView getOpenInventory() {
		checkState();
		return delegate.getOpenInventory();
	}

	public org.bukkit.entity.Entity getPassenger() {
		checkState();
		return delegate.getPassenger();
	}

	public org.bukkit.entity.Player getPlayer() {
		checkState();
		return delegate.getPlayer();
	}

	public java.lang.String getPlayerListName() {
		checkState();
		return delegate.getPlayerListName();
	}

	public long getPlayerTime() {
		checkState();
		return delegate.getPlayerTime();
	}

	public long getPlayerTimeOffset() {
		checkState();
		return delegate.getPlayerTimeOffset();
	}

	public org.bukkit.WeatherType getPlayerWeather() {
		checkState();
		return delegate.getPlayerWeather();
	}

	public int getRemainingAir() {
		checkState();
		return delegate.getRemainingAir();
	}

	public boolean getRemoveWhenFarAway() {
		checkState();
		return delegate.getRemoveWhenFarAway();
	}

	public float getSaturation() {
		checkState();
		return delegate.getSaturation();
	}

	public org.bukkit.scoreboard.Scoreboard getScoreboard() {
		checkState();
		return delegate.getScoreboard();
	}

	public org.bukkit.Server getServer() {
		checkState();
		return delegate.getServer();
	}

	public int getSleepTicks() {
		checkState();
		return delegate.getSleepTicks();
	}

	public Spigot getSpigot() {
		checkState();
		return delegate.spigot();
	}

	public int getTicksLived() {
		checkState();
		return delegate.getTicksLived();
	}

	public int getTotalExperience() {
		checkState();
		return delegate.getTotalExperience();
	}

	public org.bukkit.entity.EntityType getType() {
		checkState();
		return delegate.getType();
	}

	public java.util.UUID getUniqueId() {
		checkState();
		return delegate.getUniqueId();
	}

	public org.bukkit.entity.Entity getVehicle() {
		checkState();
		return delegate.getVehicle();
	}

	public org.bukkit.util.Vector getVelocity() {
		checkState();
		return delegate.getVelocity();
	}

	public float getWalkSpeed() {
		checkState();
		return delegate.getWalkSpeed();
	}

	public org.bukkit.World getWorld() {
		checkState();
		return delegate.getWorld();
	}

	public void giveExp(int p0) {
		checkState();
		delegate.giveExp(p0);
	}

	public void giveExpLevels(int p0) {
		checkState();
		delegate.giveExpLevels(p0);
	}

	public boolean hasLineOfSight(org.bukkit.entity.Entity p0) {
		checkState();
		return delegate.hasLineOfSight(p0);
	}

	public boolean hasMetadata(java.lang.String p0) {
		checkState();
		return delegate.hasMetadata(p0);
	}

	public boolean hasPermission(java.lang.String p0) {
		checkState();
		return delegate.hasPermission(p0);
	}

	public boolean hasPermission(org.bukkit.permissions.Permission p0) {
		checkState();
		return delegate.hasPermission(p0);
	}

	public boolean hasPlayedBefore() {
		checkState();
		return delegate.hasPlayedBefore();
	}

	public boolean hasPotionEffect(org.bukkit.potion.PotionEffectType p0) {
		checkState();
		return delegate.hasPotionEffect(p0);
	}

	public void hidePlayer(org.bukkit.entity.Player p0) {
		checkState();
		delegate.hidePlayer(p0);
	}

	public void incrementStatistic(org.bukkit.Statistic p0) {
		checkState();
		delegate.incrementStatistic(p0);
	}

	public void incrementStatistic(org.bukkit.Statistic p0, int p1) {
		checkState();
		delegate.incrementStatistic(p0, p1);
	}

	public void incrementStatistic(org.bukkit.Statistic p0, org.bukkit.Material p1) {
		checkState();
		delegate.incrementStatistic(p0, p1);
	}

	public void incrementStatistic(org.bukkit.Statistic p0, org.bukkit.Material p1, int p2) {
		checkState();
		delegate.incrementStatistic(p0, p1, p2);
	}

	public boolean isBanned() {
		checkState();
		return delegate.isBanned();
	}

	public boolean isBlocking() {
		checkState();
		return delegate.isBlocking();
	}

	public boolean isConversing() {
		checkState();
		return delegate.isConversing();
	}

	public boolean isCustomNameVisible() {
		checkState();
		return delegate.isCustomNameVisible();
	}

	public boolean isDead() {
		checkState();
		return delegate.isDead();
	}

	public boolean isEmpty() {
		checkState();
		return delegate.isEmpty();
	}

	public boolean isFlying() {
		checkState();
		return delegate.isFlying();
	}

	public boolean isHealthScaled() {
		checkState();
		return delegate.isHealthScaled();
	}

	public boolean isInsideVehicle() {
		checkState();
		return delegate.isInsideVehicle();
	}

	public boolean isLeashed() {
		checkState();
		return delegate.isLeashed();
	}

	public boolean isOnline() {
		checkState();
		return delegate.isOnline();
	}

	public boolean isOp() {
		checkState();
		return delegate.isOp();
	}

	public boolean isPermissionSet(java.lang.String p0) {
		checkState();
		return delegate.isPermissionSet(p0);
	}

	public boolean isPermissionSet(org.bukkit.permissions.Permission p0) {
		checkState();
		return delegate.isPermissionSet(p0);
	}

	public boolean isPlayerTimeRelative() {
		checkState();
		return delegate.isPlayerTimeRelative();
	}

	public boolean isSleeping() {
		checkState();
		return delegate.isSleeping();
	}

	public boolean isSleepingIgnored() {
		checkState();
		return delegate.isSleepingIgnored();
	}

	public boolean isSneaking() {
		checkState();
		return delegate.isSneaking();
	}

	public boolean isSprinting() {
		checkState();
		return delegate.isSprinting();
	}

	public boolean isValid() {
		checkState();
		return delegate.isValid();
	}

	public boolean isWhitelisted() {
		checkState();
		return delegate.isWhitelisted();
	}

	public void kickPlayer(Tregmine instance, final java.lang.String p0) {
		checkState();
		// delegate.kickPlayer(p0);
		Bukkit.getScheduler().scheduleSyncDelayedTask(instance, new Runnable() {

			@Override
			public void run() {
				delegate.kickPlayer(p0);
			}

		});
	}

	public <T extends org.bukkit.entity.Projectile> T launchProjectile(java.lang.Class<? extends T> p0) {
		checkState();
		return delegate.launchProjectile(p0);
	}

	public boolean leaveVehicle() {
		checkState();
		return delegate.leaveVehicle();
	}

	public void loadData() {
		checkState();
		delegate.loadData();
	}

	public org.bukkit.inventory.InventoryView openEnchanting(org.bukkit.Location p0, boolean p1) {
		checkState();
		return delegate.openEnchanting(p0, p1);
	}

	public org.bukkit.inventory.InventoryView openInventory(org.bukkit.inventory.Inventory p0) {
		checkState();
		return delegate.openInventory(p0);
	}

	public void openInventory(org.bukkit.inventory.InventoryView p0) {
		checkState();
		delegate.openInventory(p0);
	}

	public org.bukkit.inventory.InventoryView openWorkbench(org.bukkit.Location p0, boolean p1) {
		checkState();
		return delegate.openWorkbench(p0, p1);
	}

	public boolean performCommand(java.lang.String p0) {
		checkState();
		return delegate.performCommand(p0);
	}

	public void playEffect(org.bukkit.EntityEffect p0) {
		checkState();
		delegate.playEffect(p0);
	}

	public <T extends java.lang.Object> void playEffect(org.bukkit.Location p0, org.bukkit.Effect p1, T p2) {
		checkState();
		delegate.playEffect(p0, p1, p2);
	}

	public void playNote(org.bukkit.Location p0, org.bukkit.Instrument p1, org.bukkit.Note p2) {
		checkState();
		delegate.playNote(p0, p1, p2);
	}

	public void playSound(org.bukkit.Location p0, org.bukkit.Sound p1, float p2, float p3) {
		checkState();
		delegate.playSound(p0, p1, p2, p3);
	}

	public void recalculatePermissions() {
		checkState();
		delegate.recalculatePermissions();
	}

	public void remove() {
		checkState();
		delegate.remove();
	}

	public void removeAttachment(org.bukkit.permissions.PermissionAttachment p0) {
		checkState();
		delegate.removeAttachment(p0);
	}

	public void removeMetadata(java.lang.String p0, org.bukkit.plugin.Plugin p1) {
		checkState();
		delegate.removeMetadata(p0, p1);
	}

	public void removePotionEffect(org.bukkit.potion.PotionEffectType p0) {
		checkState();
		delegate.removePotionEffect(p0);
	}

	public void resetMaxHealth() {
		checkState();
		delegate.resetMaxHealth();
	}

	public void resetPlayerTime() {
		checkState();
		delegate.resetPlayerTime();
	}

	public void resetPlayerWeather() {
		checkState();
		delegate.resetPlayerWeather();
	}

	public void saveData() {
		checkState();
		delegate.saveData();
	}

	public void sendMap(org.bukkit.map.MapView p0) {
		checkState();
		delegate.sendMap(p0);
	}

	public void sendPluginMessage(org.bukkit.plugin.Plugin p0, java.lang.String p1, byte[] p2) {
		checkState();
		delegate.sendPluginMessage(p0, p1, p2);
	}

	public void sendRawMessage(java.lang.String p0) {
		checkState();
		delegate.sendRawMessage(p0);
	}

	public void sendSpigotMessage(BaseComponent a) {
		checkState();
		sendSpigotMessage(new BaseComponent[] { a });
	}

	public void sendSpigotMessage(BaseComponent... a) {
		checkState();
		if (getHandle().playerConnection == null)
			return;
		PacketPlayOutChat packet = new PacketPlayOutChat();
		packet.components = a;
		getHandle().playerConnection.sendPacket(packet);
	}

	public void sendStringMessage(String a) {
		checkState();
		delegate.sendMessage(a);
	}

	public void sendTrueMsg(java.lang.String p0, Tregmine instance) {
		boolean lockdown = instance.getLockdown();
		checkState();
		ChatColor color = null;
		if (lockdown) {
			color = ChatColor.RED;
		} else {
			color = ChatColor.GOLD;
		}
		if (p0.startsWith("%internal%")) {
			String message = p0.replace("%internal%", "");
			delegate.sendMessage(color + "[Internal]" + ChatColor.RESET + " > " + message);
		} else if (p0.startsWith("%warning%")) {
			String message = p0.replace("%warning%", "");
			delegate.sendMessage(ChatColor.RED + "[Warning]" + ChatColor.RESET + " > " + message);
		} else {
			delegate.sendMessage(p0);
		}

	}

	public java.util.Map<java.lang.String, java.lang.Object> serialize() {
		checkState();
		return delegate.serialize();
	}

	public void setAllowFlight(boolean p0) {
		checkState();
		delegate.setAllowFlight(p0);
	}

	public void setBanned(boolean p0) {
		checkState();
		Bukkit.getBanList(Type.NAME).addBan(delegate.getName(), ChatColor.RED + "You are banned from tregmine!", null,
				null);
	}

	public void setBedSpawnLocation(org.bukkit.Location p0) {
		checkState();
		delegate.setBedSpawnLocation(p0);
	}

	public void setBedSpawnLocation(org.bukkit.Location p0, boolean p1) {
		checkState();
		delegate.setBedSpawnLocation(p0, p1);
	}

	public void setCanPickupItems(boolean p0) {
		checkState();
		delegate.setCanPickupItems(p0);
	}

	public void setCompassTarget(org.bukkit.Location p0) {
		checkState();
		delegate.setCompassTarget(p0);
	}

	public void setCustomName(java.lang.String p0) {
		checkState();
		delegate.setCustomName(p0);
	}

	public void setCustomNameVisible(boolean p0) {
		checkState();
		delegate.setCustomNameVisible(p0);
	}

	public void setDelegate(org.bukkit.entity.Player v) {
		this.delegate = v;
	}

	public void setDisplayName(java.lang.String p0) {
		checkState();
		delegate.setDisplayName(p0);
	}

	public void setExhaustion(float p0) {
		checkState();
		delegate.setExhaustion(p0);
	}

	public void setExp(float p0) {
		checkState();
		delegate.setExp(p0);
	}

	public void setFallDistance(float p0) {
		checkState();
		delegate.setFallDistance(p0);
	}

	public void setFireTicks(int p0) {
		checkState();
		delegate.setFireTicks(p0);
	}

	public void setFlying(boolean p0) {
		checkState();
		delegate.setFlying(p0);
	}

	public void setFlySpeed(float p0) {
		checkState();
		delegate.setFlySpeed(p0);
	}

	public void setFoodLevel(int p0) {
		checkState();
		delegate.setFoodLevel(p0);
	}

	public void setGameMode(org.bukkit.GameMode p0) {
		checkState();
		delegate.setGameMode(p0);
	}

	public void setHealth(double p0) {
		checkState();
		delegate.setHealth(p0);
	}

	public void setHealthScale(double p0) {
		checkState();
		delegate.setHealthScale(p0);
	}

	public void setHealthScaled(boolean p0) {
		checkState();
		delegate.setHealthScaled(p0);
	}

	public void setItemInHand(org.bukkit.inventory.ItemStack p0) {
		checkState();
		delegate.setItemOnCursor(p0);
	}

	public void setItemOnCursor(org.bukkit.inventory.ItemStack p0) {
		checkState();
		delegate.setItemOnCursor(p0);
	}

	public void setLastDamage(double p0) {
		checkState();
		delegate.setLastDamage(p0);
	}

	public void setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent p0) {
		checkState();
		delegate.setLastDamageCause(p0);
	}

	public boolean setLeashHolder(org.bukkit.entity.Entity p0) {
		checkState();
		return delegate.setLeashHolder(p0);
	}

	public void setLevel(int p0) {
		checkState();
		delegate.setLevel(p0);
	}

	public void setMaxHealth(double p0) {
		checkState();
		delegate.setMaxHealth(p0);
	}

	public void setMaximumAir(int p0) {
		checkState();
		delegate.setMaximumAir(p0);
	}

	public void setMaximumNoDamageTicks(int p0) {
		checkState();
		delegate.setMaximumNoDamageTicks(p0);
	}

	public void setMetadata(java.lang.String p0, org.bukkit.metadata.MetadataValue p1) {
		checkState();
		delegate.setMetadata(p0, p1);
	}

	public void setNoDamageTicks(int p0) {
		checkState();
		delegate.setNoDamageTicks(p0);
	}

	public void setOp(boolean p0) {
		checkState();
		delegate.setOp(p0);
	}

	public boolean setPassenger(org.bukkit.entity.Entity p0) {
		checkState();
		return delegate.setPassenger(p0);
	}

	public void setPermission(java.lang.String p0) {
		checkState();
	}

	public void setPlayerListName(java.lang.String p0) {
		checkState();
		delegate.setPlayerListName(p0);
	}

	public void setPlayerTime(long p0, boolean p1) {
		checkState();
		delegate.setPlayerTime(p0, p1);
	}

	public void setPlayerWeather(org.bukkit.WeatherType p0) {
		checkState();
		delegate.setPlayerWeather(p0);
	}

	public void setRemainingAir(int p0) {
		checkState();
		delegate.setRemainingAir(p0);
	}

	public void setRemoveWhenFarAway(boolean p0) {
		checkState();
		delegate.setRemoveWhenFarAway(p0);
	}

	public void setResourcePack(java.lang.String p0) {
		checkState();
		delegate.setResourcePack(p0);
	}

	public void setSaturation(float p0) {
		checkState();
		delegate.setSaturation(p0);
	}

	public void setScoreboard(org.bukkit.scoreboard.Scoreboard p0) {
		checkState();
		delegate.setScoreboard(p0);
	}

	public void setSleepingIgnored(boolean p0) {
		checkState();
		delegate.setSleepingIgnored(p0);
	}

	public void setSneaking(boolean p0) {
		checkState();
		delegate.setSneaking(p0);
	}

	public void setSprinting(boolean p0) {
		checkState();
		delegate.setSprinting(p0);
	}

	public void setTicksLived(int p0) {
		checkState();
		delegate.setTicksLived(p0);
	}

	public void setTotalExperience(int p0) {
		checkState();
		delegate.setTotalExperience(p0);
	}

	public void setVelocity(org.bukkit.util.Vector p0) {
		checkState();
		delegate.setVelocity(p0);
	}

	public void setWalkSpeed(float p0) {
		checkState();
		delegate.setWalkSpeed(p0);
	}

	public void setWhitelisted(boolean p0) {
		checkState();
		delegate.setWhitelisted(p0);
	}

	public boolean setWindowProperty(org.bukkit.inventory.InventoryView.Property p0, int p1) {
		checkState();
		return delegate.setWindowProperty(p0, p1);
	}

	public void showPlayer(org.bukkit.entity.Player p0) {
		checkState();
		delegate.showPlayer(p0);
	}

	public Player.Spigot spigot() {
		return delegate.spigot();
	}

	public boolean teleport(org.bukkit.entity.Entity p0) {
		checkState();
		return delegate.teleport(p0);
	}

	public boolean teleport(org.bukkit.entity.Entity p0, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause p1) {
		checkState();
		return delegate.teleport(p0, p1);
	}

	public boolean teleport(org.bukkit.Location p0) {
		checkState();
		return delegate.teleport(p0);
	}

	public boolean teleport(org.bukkit.Location p0, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause p1) {
		checkState();
		return delegate.teleport(p0, p1);
	}

}
