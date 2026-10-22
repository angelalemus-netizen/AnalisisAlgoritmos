package com.example.analisisalgoritmos;

public class Sumatorias {
    public static long sumatoriaN(long n){
        long sumatoria = 0;
        for(int i=0;i<=n;i++){
            sumatoria+=i;
        }
        return sumatoria;
    }

    public static long sumatoriaGauss(long n){
        long sumatoria = 0;
        sumatoria =( n*(n+1)) / 2;
        return sumatoria;
    }
//    public static long sumRecursiva(long n){
//        return sumatoriaRecursiva(n, 0);
//    }
//    private  static long sumatoriaRecursiva(long n, long i){
//        if (i==n){
//            return 0;
//        }
//        long sumatoria = 0+i;
//        i++;
//        return sumatoria + sumatoriaRecursiva(n, i);
//    }
}
