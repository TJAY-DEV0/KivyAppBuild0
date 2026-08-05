plugins {
    id("{{ plugin_id }}")
}

android {
    namespace = "{{ package_name }}"
    compileSdk = {{ compile_sdk }}

{{ ndk_line }}

    defaultConfig {
{{ app_id_lines }}
        minSdk = {{ min_sdk }}
        targetSdk = {{ target_sdk }}
    }
}

dependencies {
{{ extra_deps }}
}

{{ site_packages_tasks }}
