package goldzweigapps.com.compiler.adapter

import com.google.common.base.CaseFormat

/**
 * Created by gilgoldzweig on 08/02/2018.
 */
class CamelCaseNamingAdapter : NamingAdapter() {

    override fun buildNameForId(id: String): String =
            CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, id)
}