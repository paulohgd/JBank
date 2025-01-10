package tech.buildrun.jbank.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_deposit")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "deposit_id")
    private UUID depositId;

    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @Column(name = "deposit_value")
    private BigDecimal depositValue;

    @Column(name = "deposit_date_time")
    private LocalDateTime depositDateTime;

    @Column(name = "ip_address")
    private String ipAddress;

    public Deposit() {
    }

    public LocalDateTime getDepositDateTime() {
        return depositDateTime;
    }

    public void setDepositDateTime(LocalDateTime depositDateTime) {
        this.depositDateTime = depositDateTime;
    }

    public UUID getDepositId() {
        return depositId;
    }

    public void setDepositId(UUID depositId) {
        this.depositId = depositId;
    }

    public BigDecimal getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(BigDecimal depositValue) {
        this.depositValue = depositValue;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
