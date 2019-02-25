package pnpinfos.propmgmt.bc.main;

import pnpinfos.propmgmt.bc.model.Block;
import pnpinfos.propmgmt.bc.model.TransactionInput;
import pnpinfos.propmgmt.bc.model.TransactionOutput;
import pnpinfos.propmgmt.bc.model.Wallet;

import java.util.ArrayList;
import java.util.HashMap;

public class MainThree {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static HashMap<String, TransactionOutput> UTXOs = new HashMap<String,TransactionOutput>(); //list of all unspent transactions.
    public static int difficulty = 5;
    public static Wallet walletA;
    public static Wallet walletB;

    public static void main(String[] args) {


    }



}
