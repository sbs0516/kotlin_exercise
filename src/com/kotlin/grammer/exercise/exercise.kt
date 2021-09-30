import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var h:Int
    var m:Int
    do{
        h = sc.nextInt()
    } while(h<0 || h>23)
    do{
        m = sc.nextInt()
    } while(m<0 || m>59)
    printTime(h,m)
}
fun printTime(h:Int, m:Int){
    val totalMin = (24+h)*60+m-45
    val newMin = totalMin%60
    val newHour = (totalMin/60)%24
    println("$newHour $newMin")
    /*
    if(h>0)
        (h*60+m-45).let{time:Int ->
            println("${time/60} ${time%60}")
        }
    if(h==0){
        if(m>=45)
            println("$h ${m-45}")
        else
            println("${(24*60+m-45)/60} ${(24*60+m-45)%60}")
    }
     */
}