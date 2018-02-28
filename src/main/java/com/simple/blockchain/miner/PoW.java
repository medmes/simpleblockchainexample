package com.simple.blockchain.miner;

import com.simple.blockchain.block.BlockData;
import com.simple.blockchain.block.BlockUtil;

import java.security.DigestException;
import java.security.NoSuchAlgorithmException;

public class PoW {

	private static final int NUM_BITS = 16;

	public static String generateHash(int index, String previous_hash, long timestamp, BlockData data)
			throws NoSuchAlgorithmException, DigestException {

		String resource = BlockUtil.wrapBlockContent(index, previous_hash, timestamp, data);
		return Hash.generate(NUM_BITS, resource);
	}

	public static boolean validate(String hash) throws NoSuchAlgorithmException, DigestException {
		return Hash.valid(NUM_BITS, hash);
	}
}
