package com.dagger.core_db_impl.di

import com.dagger.core_db_api.CoreDbApi
import dagger.Component
import javax.inject.Singleton

@Component(
    dependencies = [DbCoreDependencies::class],
    modules = [DbModule::class]
)
@Singleton
abstract class CoreDbComponent : CoreDbApi {
    companion object {
        @Volatile
        private var component: CoreDbComponent? = null

        fun get(dependencies: DbCoreDependencies): CoreDbComponent {
            if (component == null) {
                synchronized(CoreDbComponent::class) {
                    if (component == null) {
                        component = DaggerCoreDbComponent.builder()
                            .dbCoreDependencies(dependencies)
                            .build()
                    }
                }
            }
            return component!!
        }
    }
}