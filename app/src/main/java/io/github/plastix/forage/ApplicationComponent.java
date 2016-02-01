package io.github.plastix.forage;

import javax.inject.Singleton;

import dagger.Component;
import io.github.plastix.forage.ui.cachedetail.CacheDetailComponent;
import io.github.plastix.forage.ui.cachedetail.CacheDetailModule;
import io.github.plastix.forage.ui.cachelist.CacheListComponent;
import io.github.plastix.forage.ui.cachelist.CacheListModule;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    CacheListComponent plus(CacheListModule module);

    CacheDetailComponent plus(CacheDetailModule module);

    void injectTo(ForageApplication forageApplication);
}
