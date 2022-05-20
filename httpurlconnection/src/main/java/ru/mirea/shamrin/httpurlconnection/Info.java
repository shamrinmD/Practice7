package ru.mirea.shamrin.httpurlconnection;

public class Info {
    private String ip;
    private String region;
    private String country;

    public Info(String ip, String city, String country) {
        this.ip = ip;
        this.region = city;
        this.country = country;
    }

    public String getIp() { return ip; }

    public String getCity() { return region; }

    public String getCountry() { return country; }
}