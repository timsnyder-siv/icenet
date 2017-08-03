package icenet

import chisel3._

object IceNetConsts {
  val NET_IF_WIDTH = 64
  val NET_LEN_BITS = 16
  val ETH_MAX_WORDS = 190
  val ETH_HEAD_WORDS = 2
}

class EthernetHeader extends Bundle {
  val srcmac = UInt(48.W)
  val dstmac = UInt(48.W)
  val padding = UInt(16.W)
}
