package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;
import java.util.Date;

public class Blocks implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -232924942713148596L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.block_number
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Integer blockNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.prev_block_id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String prevBlockId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.irreversible
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Boolean irreversible;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.timestamp
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Date timestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.transaction_merkle_root
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String transactionMerkleRoot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.action_merkle_root
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String actionMerkleRoot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.producer
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String producer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.version
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.new_producers
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String newProducers;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.num_transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Integer numTransactions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blocks.confirmed
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Integer confirmed;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.id
     *
     * @return the value of blocks.id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.id
     *
     * @param id the value for blocks.id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.block_number
     *
     * @return the value of blocks.block_number
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Integer getBlockNumber() {
        return blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.block_number
     *
     * @param blockNumber the value for blocks.block_number
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.prev_block_id
     *
     * @return the value of blocks.prev_block_id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getPrevBlockId() {
        return prevBlockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.prev_block_id
     *
     * @param prevBlockId the value for blocks.prev_block_id
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setPrevBlockId(String prevBlockId) {
        this.prevBlockId = prevBlockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.irreversible
     *
     * @return the value of blocks.irreversible
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Boolean getIrreversible() {
        return irreversible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.irreversible
     *
     * @param irreversible the value for blocks.irreversible
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setIrreversible(Boolean irreversible) {
        this.irreversible = irreversible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.timestamp
     *
     * @return the value of blocks.timestamp
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.timestamp
     *
     * @param timestamp the value for blocks.timestamp
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.transaction_merkle_root
     *
     * @return the value of blocks.transaction_merkle_root
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.transaction_merkle_root
     *
     * @param transactionMerkleRoot the value for blocks.transaction_merkle_root
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.action_merkle_root
     *
     * @return the value of blocks.action_merkle_root
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getActionMerkleRoot() {
        return actionMerkleRoot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.action_merkle_root
     *
     * @param actionMerkleRoot the value for blocks.action_merkle_root
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setActionMerkleRoot(String actionMerkleRoot) {
        this.actionMerkleRoot = actionMerkleRoot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.producer
     *
     * @return the value of blocks.producer
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getProducer() {
        return producer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.producer
     *
     * @param producer the value for blocks.producer
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.version
     *
     * @return the value of blocks.version
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.version
     *
     * @param version the value for blocks.version
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.new_producers
     *
     * @return the value of blocks.new_producers
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getNewProducers() {
        return newProducers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.new_producers
     *
     * @param newProducers the value for blocks.new_producers
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setNewProducers(String newProducers) {
        this.newProducers = newProducers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.num_transactions
     *
     * @return the value of blocks.num_transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Integer getNumTransactions() {
        return numTransactions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.num_transactions
     *
     * @param numTransactions the value for blocks.num_transactions
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setNumTransactions(Integer numTransactions) {
        this.numTransactions = numTransactions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blocks.confirmed
     *
     * @return the value of blocks.confirmed
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Integer getConfirmed() {
        return confirmed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blocks.confirmed
     *
     * @param confirmed the value for blocks.confirmed
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }
}