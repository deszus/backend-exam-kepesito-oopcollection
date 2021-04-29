package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> deceased = new ArrayList<>();
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
            if (unit.getHitPoints() < 25) {
                deceased.add(unit);
            }
        }
        army.removeAll(deceased);
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit unit : army) {
            result += unit.doDamage();
        }
        return result;
    }

    public int getArmySize() {
        return army.size();
    }

}
