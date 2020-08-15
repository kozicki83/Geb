package model

import common.BaseBuilder

class WIMotoPolicyBuilder extends BaseBuilder<WiMotoPolicy, WIMotoPolicyBuilder> {

    static createDefault() {
        WIMotoPolicyBuilder policy = new WIMotoPolicyBuilder()
        policy.obj = new WiMotoPolicy(
                insuranceCoverage: 'OC',
                howManyAreOwners: 'Więcej niż jeden',
                whoIsMainOwner: 'Właściciel',
                numberOwners: '1'
        )
        return policy
    }
}
