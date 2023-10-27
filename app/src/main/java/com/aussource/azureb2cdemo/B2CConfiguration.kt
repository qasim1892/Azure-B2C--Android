package com.aussource.azureb2cdemo



object B2CConfiguration {
    /**
     * Name of the policies/user flows in your B2C tenant.
     * See https://docs.microsoft.com/en-us/azure/active-directory-b2c/active-directory-b2c-reference-policies for more info.
     */
    val Policies = arrayOf(
            "B2C_1_testb2c"
    )


    /**
     * Returns an authority for the given policy name.
     *
     * @param policyName name of a B2C policy.
     */
    fun getAuthorityFromPolicyName(): String {
        return "https://netzerosecurenonprod.b2clogin.com/tfp/netzerosecurenonprod.onmicrosoft.com/B2C_1_testb2c/"
    }

    /**
     * Returns an array of scopes you wish to acquire as part of the returned token result.
     * These scopes must be added in your B2C application page.
     */
    val scopes: List<String>
        get() = listOf("ceea592d-b00c-4e68-899a-cd48753ed54a")
}