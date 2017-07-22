package org.bitcoinj.core.peers.discovery;

public interface NetworkDiscoveryParameters {
    /** Returns DNS names that when resolved, give IP addresses of active peers. */
    String[] getDnsSeeds();

    /** Default TCP port on which to connect to nodes. */
    int getPort();

    /** Returns discovery objects for seeds implementing the Cartographer protocol. See {@link org.bitcoinj.core.peers.discovery.HttpDiscovery} for more info. */
    HttpDiscovery.Details[] getHttpSeeds();

    String getPaymentProtocolId();

    /** Returns IP address of active peers. */
    int[] getAddrSeeds();
}
