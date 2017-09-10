package com.fsck.k9.mailstore.migrations;


import java.util.List;

import android.content.Context;

import com.fsck.k9.Account;
import com.fsck.k9.mail.Flag;
import com.fsck.k9.mailstore.LocalMailStore;
import com.fsck.k9.preferences.Storage;


/**
 * Helper to allow accessing classes and methods that aren't visible or accessible to the 'migrations' package
 */
public interface MigrationsHelper {
    LocalMailStore getLocalStore();
    Storage getStorage();
    Account getAccount();
    Context getContext();
    String serializeFlags(List<Flag> flags);
}
