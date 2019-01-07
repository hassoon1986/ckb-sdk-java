package org.nervos.ckb.service;

import org.nervos.ckb.methods.request.Request;
import org.nervos.ckb.methods.response.*;
import org.nervos.ckb.methods.response.item.Cell;
import org.nervos.ckb.methods.response.item.Transaction;

/**
 * Created by duanyytop on 2018-12-20.
 * Copyright © 2018 Nervos Foundation. All rights reserved.
 */
public interface CKBApi {

    Request<?, CkbBlock> getBlock(String blockHash);

    Request<?, CkbTransaction> getTransaction(String transactionHash);

    Request<?, CkbBlockHash> getBlockHash(long blockNumber);

    Request<?, CkbHeader> getTipHeader();

    Request<?, CkbCells> getCellsByTypeHash(String typeHash, long fromBlockNumber, long toBlockNumber);

    Request<?, CkbCell> getLiveCell(Cell.OutPoint outPoint);

    Request<?, CkbBlockNumber> getTipBlockNumber();

    Request<?, CkbNodeId> localNodeId();

    Request<?, CkbTransactionHash> sendTransaction(Transaction transaction);

}
