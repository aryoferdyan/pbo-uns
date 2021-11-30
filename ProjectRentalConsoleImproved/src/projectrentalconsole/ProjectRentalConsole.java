/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;

/**
 *
 * @author Asus
 */
public class ProjectRentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member n = new Member();
        n.addMember(new DaftarMember("M001", "Mr. X", "Silver"));
        n.addMember(new DaftarMember("M002", "Mr. Y", "Gold"));
        n.addMember(new DaftarMember("M003", "Mr. Z", "Platinum"));
        
        DaftarMember member = n.inputMember();
        switch(member.dataJenis()) {
            case "Silver":
                Silver silv = new Silver();
                silv.inputSilver(member);
                break;
            case "Gold":
                Gold gold = new Gold();
                gold.inputGold(member);
                break;
            case "Platinum":
                Platinum plat = new Platinum();
                plat.inputPlatinum(member);
                break;
        }
    }
    
}
