package ru.mirea.shamrin.httpurlconnection;

public class Info {
    private String ip;
    private String region;
    private String country;

    public Info(String ip, String region, String country) {
        this.ip = ip;
        this.region = region;
        this.country = country;
    }

    public String getIp() { return ip; }

    public String getRegion() { return region; }

    public String getCountry() { return country; }
}