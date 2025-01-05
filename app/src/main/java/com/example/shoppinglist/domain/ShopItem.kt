package com.example.shoppinglist.domain

data class ShopItem(
    var name: String,
    var amount: Int,
    var enabled: Boolean,
    var id: Int = INDEFINED_ID
) {
    companion object {
        const val INDEFINED_ID = -1
    }
}
