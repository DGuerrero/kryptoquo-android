package model

import com.squareup.moshi.Json

class CoinApiCoinsReponse {
    @Json(name = "asset_id")
    private var assetId: String? = null
    @Json(name = "name")
    private var name: String? = null
    @Json(name = "type_is_crypto")
    private var typeIsCrypto: Int? = null
    @Json(name = "data_start")
    private var dataStart: String? = null
    @Json(name = "data_end")
    private var dataEnd: String? = null
    @Json(name = "data_quote_start")
    private var dataQuoteStart: String? = null
    @Json(name = "data_quote_end")
    private var dataQuoteEnd: String? = null
    @Json(name = "data_orderbook_start")
    private var dataOrderbookStart: String? = null
    @Json(name = "data_orderbook_end")
    private var dataOrderbookEnd: String? = null
    @Json(name = "data_trade_start")
    private var dataTradeStart: String? = null
    @Json(name = "data_trade_end")
    private var dataTradeEnd: String? = null
    @Json(name = "data_trade_count")
    private var dataTradeCount: Int? = null
    @Json(name = "data_symbols_count")
    private var dataSymbolsCount: Int? = null

    fun getAssetId(): String? {
        return assetId
    }

    fun setAssetId(assetId: String) {
        this.assetId = assetId
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getTypeIsCrypto(): Int? {
        return typeIsCrypto
    }

    fun setTypeIsCrypto(typeIsCrypto: Int?) {
        this.typeIsCrypto = typeIsCrypto
    }

    fun getDataStart(): String? {
        return dataStart
    }

    fun setDataStart(dataStart: String) {
        this.dataStart = dataStart
    }

    fun getDataEnd(): String? {
        return dataEnd
    }

    fun setDataEnd(dataEnd: String) {
        this.dataEnd = dataEnd
    }

    fun getDataQuoteStart(): String? {
        return dataQuoteStart
    }

    fun setDataQuoteStart(dataQuoteStart: String) {
        this.dataQuoteStart = dataQuoteStart
    }

    fun getDataQuoteEnd(): String? {
        return dataQuoteEnd
    }

    fun setDataQuoteEnd(dataQuoteEnd: String) {
        this.dataQuoteEnd = dataQuoteEnd
    }

    fun getDataOrderbookStart(): String? {
        return dataOrderbookStart
    }

    fun setDataOrderbookStart(dataOrderbookStart: String) {
        this.dataOrderbookStart = dataOrderbookStart
    }

    fun getDataOrderbookEnd(): String? {
        return dataOrderbookEnd
    }

    fun setDataOrderbookEnd(dataOrderbookEnd: String) {
        this.dataOrderbookEnd = dataOrderbookEnd
    }

    fun getDataTradeStart(): String? {
        return dataTradeStart
    }

    fun setDataTradeStart(dataTradeStart: String) {
        this.dataTradeStart = dataTradeStart
    }

    fun getDataTradeEnd(): String? {
        return dataTradeEnd
    }

    fun setDataTradeEnd(dataTradeEnd: String) {
        this.dataTradeEnd = dataTradeEnd
    }

    fun getDataTradeCount(): Int? {
        return dataTradeCount
    }

    fun setDataTradeCount(dataTradeCount: Int?) {
        this.dataTradeCount = dataTradeCount
    }

    fun getDataSymbolsCount(): Int? {
        return dataSymbolsCount
    }

    fun setDataSymbolsCount(dataSymbolsCount: Int?) {
        this.dataSymbolsCount = dataSymbolsCount
    }
}