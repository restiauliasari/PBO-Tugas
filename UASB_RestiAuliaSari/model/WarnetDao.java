/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASB_RestiAuliaSari.model;
import java.util.List;
/**
 *
 * @author USER
 */
public interface WarnetDao {
    void save(Warnet warnet);
    void update(int index, Warnet warnet);
    void delete (int index);
    Warnet getWarnet(int index);
    List<Warnet> getAll();
}
