package org.elastos.wallet.ela.ui.Assets.bean;

public class CallBackJwtEntity {
    /**
     * type : credaccess
     * iss : did:ela:iUQtoHoQx8zgxRcLx6FxLKE4eYJiEz8nzC
     * iat : 1566352213
     * exp : 1566382213
     * aud : did:ela:e02e05a2e7dc29a5f2a5882c509a56CeYJ
     * req : xx
     */

    private String type;
    private String iss;
    private long iat;
    private long exp;
    private String aud;
    private String req;
    private String presentation;


    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public long getIat() {
        return iat;
    }

    public void setIat(long iat) {
        this.iat = iat;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }


}