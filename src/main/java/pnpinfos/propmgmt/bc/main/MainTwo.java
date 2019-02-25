package pnpinfos.propmgmt.bc.main;

import pnpinfos.propmgmt.bc.model.Block;
import pnpinfos.propmgmt.bc.model.Transaction;
import pnpinfos.propmgmt.bc.model.Wallet;
import pnpinfos.propmgmt.bc.util.StringUtil;

import java.security.Security;
import java.util.ArrayList;

public class MainTwo {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 5;
    public static Wallet walletA;
    public static Wallet walletB;

    public static void main(String[] args) {
        //Setup Bouncey castle as a Security Provider
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        //Create the new wallets
        walletA = new Wallet();
        walletB = new Wallet();
        //Test public and private keys
        System.out.println("Private and public keys:");
        System.out.println("\\" + StringUtil.getStringFromKey(walletA.privateKey) );
        System.out.println("\\" + StringUtil.getStringFromKey(walletA.publicKey));
        //Create a test transaction from WalletA to walletB
        Transaction transaction = new Transaction(walletA.publicKey, walletB.publicKey, 5, null);
        transaction.generateSignature(walletA.privateKey);
        //Verify the signature works and verify it from the public key
        System.out.println("\\" + "Is signature verified \\");
        System.out.println("\\" + transaction.verifiySignature());

    }
}
