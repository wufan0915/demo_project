package com.su.yoga.utils;

import org.apache.ibatis.cache.NullCacheKey;

/**
 * @author wufan
 * @date 2022/1/3 11:29
 * @des 业务层ip字符串与对应的int进行转换
 * 00000000|00000000|00000000|00000000
 */
public class IpUtils {

    /**
     * @param ipStr 字符串ip
     * @return ipLong
     * @desc 将字符串ip转换为Long
     */
    public static long IpToLong(String ipStr){
        String[] ip = ipStr.split("\\.");
        return (Long.parseLong(ip[0]) << 24) + (Long.parseLong(ip[1]) << 16)
                + (Long.parseLong(ip[2]) << 8) + (Long.parseLong(ip[3]));
    }

    /**
     * @param ipLong
     * @return ipString
     */
    public static String LongToString(Long ipLong){
        StringBuilder ipStr = new StringBuilder();
        ipStr.append(ipLong >>> 24).append(".");
        ipStr.append((ipLong >>> 16) & 0XFF).append(".");
        ipStr.append((ipLong >>> 8) & 0XFF).append(".");
        ipStr.append(ipLong & 0XFF);
        return ipStr.toString();
    }


    public static void main(String[] args) {
        String ipStr = "255.255.255.255";
        System.out.println(IpUtils.IpToLong(ipStr));

        Long ipLong = 4294967295L;
        System.out.println(IpUtils.LongToString(ipLong));


    }


}
