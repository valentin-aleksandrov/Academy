package academy.areas.modules.services;

import academy.areas.modules.entities.Module;

import java.util.List;

public interface ModuleServices {
    List<Module> getAllModules();
    Module getModule(final Integer id);
    Integer createModule(Module module);
    void updateModule(Module module);
    void disableModule(final Integer id);
}