package com.here.tcs.tpeg

/**
 * Created by chwon on 6/29/2017.
 */
enum class LocRefType {
    TMC,
    ETL,
    XYLR,
    OLR
}

enum class TPEGType {
    TPEG,
    TRAFFIC_ML
}

enum class AppType {
    TFP,
    TEC
}

class FCFilter(val minFC: Int, val maxFC: Int = 0) {
    fun getAllowedFunctionalClass(): String {
        var FCstring = ""
        if (maxFC <= minFC) {
            if (minFC.coerceIn(1, 5) == minFC && maxFC.coerceIn(1,5) == maxFC) {

            }
        }
    }


}

data class TPEGHeader(val trafficType:TPEGType, val messageSize:Int, val sessionSize: Int)
data class LocRef(val locRef: LocRefType, val version: String)
data class App(val app: AppType, val version:String)
data class Configuration(val radius: Int = 10,
                         val timeout:Int = 100,
                         val expiration:Int = 999,
                         val frequency: Int = 5, )
