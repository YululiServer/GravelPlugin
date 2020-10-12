package xyz.n7mn.dev.yululi.gravelplugin.Stage;

import java.util.Date;
import java.util.UUID;

public class StageWorld {

    /*
    ステージクラス (ワールドデータ管理用)
     */

    private UUID uuid;
    private String name;
    private UUID createUser;
    private Date createDate;
    private String worldVersion;

    public StageWorld(UUID id, String name, UUID createUser, Date createDate, String worldVersion){
        this.uuid = id;
        this.name = name;
        this.createUser = createUser;
        this.createDate = createDate;
        this.worldVersion = worldVersion;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getCreateUser() {
        return createUser;
    }

    public void setCreateUser(UUID createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getWorldVersion() {
        return worldVersion;
    }

    public void setWorldVersion(String worldVersion) {
        this.worldVersion = worldVersion;
    }
}
