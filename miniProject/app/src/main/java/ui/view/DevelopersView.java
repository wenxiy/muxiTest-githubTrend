package ui.view;

import service.entity.Developers;

public interface DevelopersView extends View {
    void success(Developers mdevelopers);

    void error(String result);
}
