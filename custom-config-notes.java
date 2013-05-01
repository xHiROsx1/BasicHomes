package me.temp.test;

//Ignore the missing imports.
//Coded this on a we browser.

public class Test extends JavaPlugin {
  @Overrid
  public void onEnable() {
    //Enable
  }
  @Override
  public void onDisable() {
    //Disable
  }
////////////////////////////////////////////////
//Custom Config: data.yml  -  HiROs15         //
////////////////////////////////////////////////
private FileConfiguration dataconfig = null;
private File fconfig = null;
public void reloadDataConfig() {
  if(fconfig == null) {
    fconfig = new File(getDataFolder(), "data.yml");
  }
  dataconfig = YamlConfiguration.loadConfiguration(fconfig);
  
  InputStream defdataconfigstream = this.getResource("data.yml");
  if(defdataconfigstream != null) {
    YamlConfiguration defdataconfig = YamlConfiguration.loadConfiguration(defdataconfigstream);
    dataconfig.setDefaults(defdataconfig);
  }
}
