import com.example.analisisalgoritmos.Sumatorias;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Sumatoria Iterativa");
    for(long i = 100; i<=100000000; i*=10){
        long startTime = System.nanoTime();
        Sumatorias.sumatoriaN(i);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration);

    }
    System.out.println("Sumatoria Gauss");
    for(long i = 100; i<=100000000; i*=10){
        long startTime = System.nanoTime();
        Sumatorias.sumatoriaGauss(i);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration);

    }
    System.out.println("Sumatoria Recursiva");
//    for(long i = 100; i<=100000000; i*=10){
//        long startTime = System.nanoTime();
//        Sumatorias.sumRecursiva(i);
//        long endTime = System.nanoTime();
//        long duration = endTime - startTime;
//        System.out.println(duration);
//
//    }



}
