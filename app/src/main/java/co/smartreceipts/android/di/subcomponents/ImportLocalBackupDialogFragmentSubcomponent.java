package co.smartreceipts.android.di.subcomponents;

import co.smartreceipts.android.di.scopes.FragmentScope;
import co.smartreceipts.android.sync.widget.backups.ImportLocalBackupDialogFragment;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@FragmentScope
@Subcomponent
public interface ImportLocalBackupDialogFragmentSubcomponent extends AndroidInjector<ImportLocalBackupDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ImportLocalBackupDialogFragment> {

    }
}
