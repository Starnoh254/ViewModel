package com.fireb.viewmodelpractice.model

data class PaymentDetails(
    val address: String,
    val constituency: String,
    val county: String,
    val driverID: String,
    val email: String,
    val firstName: String,
    val iD: Int,
    val idnumb: Int,
    val joiningDate: String,
    val lastName: String,
    val mobileNumber: Long,
    val password: String,
    val amount: String,
    val checkoutRequestID: String,
    val id: Int,
    val merchantRequestID: String,
    val mpesaReceiptNumber: String,
    val phoneNumber: Long,
    val resultCode: Int,
    val resultDesc: String,
    val transactionDate: String
)