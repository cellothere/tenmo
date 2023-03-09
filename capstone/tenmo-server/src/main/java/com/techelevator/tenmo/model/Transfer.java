package com.techelevator.tenmo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Transfer {

    @JsonProperty("transfer_id")
    private int transferId;
    @JsonProperty("transfer_type_id")
    private int transferTypeId;
//    @JsonProperty("transfer_type_desc")
//    private String transferTypeDesc;
    @JsonProperty("transfer_status_id")
    private int transferStatusId;
//    @JsonProperty("transfer_status_desc")
//    private String transferStatusDesc;
    @JsonProperty("account_from")
    private int accountFrom;
    @JsonProperty("account_to")
    private int accountTo;
    @JsonProperty("amount")
    private BigDecimal amount;

    public Transfer() {
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId){
        this.transferId = transferId;
    }

    public int getTransferTypeId(){
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId){
        this.transferTypeId=transferTypeId;
    }

    public int getTransferStatusId(){
        return transferStatusId;
    }

    public void setTransferStatusId(int transferStatusId){
        this.transferStatusId=transferStatusId;
    }

    public int getAccountFrom(){
        return accountFrom;
    }

    public void setAccountFrom(int accountFrom){
        this.accountFrom=accountFrom;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public void setAmount(BigDecimal amount){
        this.amount=amount;
    }

//    public String getTransferStatusDesc() {
//        return transferStatusDesc;
//    }
//
//    public void setTransferStatusDesc(String transferStatusDesc){
//        this.transferStatusDesc=transferStatusDesc;
//    }
//
//    public String getTransferTypeDesc(){
//        return transferTypeDesc;
//    }
//
//    public void setTransferTypeDesc(String transferTypeDesc) {
//        this.transferTypeDesc = transferTypeDesc;
//    }
//
//

}
