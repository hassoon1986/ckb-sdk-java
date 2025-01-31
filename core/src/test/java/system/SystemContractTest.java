package system;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.nervos.ckb.service.CKBService;
import org.nervos.ckb.service.HttpService;
import org.nervos.ckb.system.SystemContract;
import org.nervos.ckb.system.type.SystemScriptCell;
import org.nervos.ckb.utils.Network;

public class SystemContractTest {
  @Test
  public void testGetSystemContract() throws IOException {
    SystemScriptCell systemScriptCell =
        SystemContract.getSystemScriptCell(
            CKBService.build(new HttpService("http://localhost:8114/")), Network.TESTNET);
    Assertions.assertNotNull(systemScriptCell);
  }
}
