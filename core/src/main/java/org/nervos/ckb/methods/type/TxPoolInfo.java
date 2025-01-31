package org.nervos.ckb.methods.type;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Copyright © 2019 Nervos Foundation. All rights reserved. */
public class TxPoolInfo {

  public long pending;
  public long staging;
  public long orphan;

  @JsonProperty("last_txs_updated_at")
  public String lastTxsUpdatedAt;

  @JsonProperty("total_tx_cycles")
  public String totalTxCycles;

  @JsonProperty("total_tx_size")
  public String totalTxSize;
}
