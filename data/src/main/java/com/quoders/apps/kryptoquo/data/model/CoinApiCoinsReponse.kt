package model

import com.squareup.moshi.Json

class CoinApiCoinsReponse {
    @Json(name = "asset_id")
    var assetId: String? = null
    @Json(name = "name")
    var name: String? = null
    @Json(name = "type_is_crypto")
    var typeIsCrypto: Int? = null
    @Json(name = "data_start")
    var dataStart: String? = null
    @Json(name = "data_end")
    var dataEnd: String? = null
    @Json(name = "data_quote_start")
    var dataQuoteStart: String? = null
    @Json(name = "data_quote_end")
    var dataQuoteEnd: String? = null
    @Json(name = "data_orderbook_start")
    var dataOrderbookStart: String? = null
    @Json(name = "data_orderbook_end")
    var dataOrderbookEnd: String? = null
    @Json(name = "data_trade_start")
    var dataTradeStart: String? = null
    @Json(name = "data_trade_end")
    var dataTradeEnd: String? = null
    @Json(name = "data_trade_count")
    var dataTradeCount: Int? = null
    @Json(name = "data_symbols_count")
    var dataSymbolsCount: Int? = null
}