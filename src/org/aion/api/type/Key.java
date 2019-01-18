package org.aion.api.type;

import org.aion.base.type.AionAddress;
import org.aion.base.util.ByteArrayWrapper;

/**
 * The key class wrapped the user account information.
 *
 * @author Jay Tseng
 * @see org.aion.api.IAccount#accountBackup(java.util.List) accountBackup
 * @see org.aion.api.IAccount#accountExport(java.util.List) accountExport
 * @see org.aion.api.IAccount#accountCreate(java.util.List, boolean) accountCreate
 */
public final class Key {

    // 32 bytes array
    private final AionAddress publicKey;
    // 64 bytes array
    private final ByteArrayWrapper privateKey;
    private final String passPhrase;

    public Key(final AionAddress s, final ByteArrayWrapper k) {
        if (s == null || k == null) {
            throw new NullPointerException();
        }

        this.publicKey = s;
        this.privateKey = k;
        this.passPhrase = null;
    }

    public Key(final AionAddress s, final String pw) {
        if (s == null || pw == null) {
            throw new NullPointerException();
        }

        this.publicKey = s;
        this.passPhrase = pw;
        this.privateKey = null;
    }

    public AionAddress getPubKey() {
        return publicKey;
    }

    public ByteArrayWrapper getPriKey() {
        return privateKey;
    }

    public String getPassPhrase() {
        return passPhrase;
    }
}
