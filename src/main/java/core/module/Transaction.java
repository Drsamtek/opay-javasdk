package core.module;

import core.ConnectionClient;
import core.Endpoint;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.TreeMap;

public class Transaction {
    private ConnectionClient connectionClient;

    public Transaction(ConnectionClient connectionClient)
    {
        this.connectionClient = connectionClient;
    }

    public JSONObject transferToBank(TreeMap<String, Object> param) {
        return this.connectionClient.makePostRequest(param,Endpoint.OPAY_TRANSFER_TOBANKS);
    }

    public JSONObject transferToWallet(TreeMap<String, Object> param) {
        return this.connectionClient.makePostRequest(param,Endpoint.OPAY_TRANSFER_TOWALLET);
    }

    public JSONObject transferToBankStatus(TreeMap<String, Object> param) {
        return this.connectionClient.makePostRequest(param,Endpoint.OPAY_TRANSFER_STATUS_TOBANKS);
    }

    public JSONObject transferStatusToWallet(TreeMap<String, Object> param) {
        return this.connectionClient.makePostRequest(param,Endpoint.OPAY_TRANSFER_STATUS_TOWALLET);
    }

    public JSONObject allSupportingBanks() {
        return this.connectionClient.makePostRequest(Endpoint.OPAY_TRANSFER_SUPPORT_BANKS);
    }

    public JSONObject allSupportingCountries() {
        return this.connectionClient.makePostRequest(Endpoint.OPAY_TRANSFER_SUPPORT_COUNTRIES);
    }

}