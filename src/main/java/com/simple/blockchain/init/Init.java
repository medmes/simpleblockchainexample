package com.simple.blockchain.init;

import com.simple.blockchain.block.BlockData;
import com.simple.blockchain.block.Block;
import com.simple.blockchain.chain.Blockchain;
import com.simple.blockchain.miner.Miner;


import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

public class Init {

	public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
		for (int i = 0; i < 100; i++) {
			BlockData data = new BlockData("Mohammed", i);
			Block block = Miner.generateNewBlock(data);
			if (Miner.isNewBlockValid(block))
				Blockchain.pushNewBlock(block);

			System.out.println(block.getHash());
		}
	}
}
