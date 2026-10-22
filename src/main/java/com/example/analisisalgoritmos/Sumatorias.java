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

    public  static long sumatoriaRecursiva(long n){
        if(n<=0){
            return 0;
        }
        return n+ sumatoriaRecursiva(n-1);
    }
}
