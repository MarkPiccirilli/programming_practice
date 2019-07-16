/********************************************************************************
** Form generated from reading UI file 'signalsslots.ui'
**
** Created by: Qt User Interface Compiler version 5.9.5
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_SIGNALSSLOTS_H
#define UI_SIGNALSSLOTS_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QProgressBar>
#include <QtWidgets/QSlider>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_SignalsSlots
{
public:
    QWidget *centralWidget;
    QWidget *widget;
    QVBoxLayout *verticalLayout;
    QProgressBar *progressBar;
    QSlider *horizontalSlider;
    QMenuBar *menuBar;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *SignalsSlots)
    {
        if (SignalsSlots->objectName().isEmpty())
            SignalsSlots->setObjectName(QStringLiteral("SignalsSlots"));
        SignalsSlots->resize(400, 300);
        centralWidget = new QWidget(SignalsSlots);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        widget = new QWidget(centralWidget);
        widget->setObjectName(QStringLiteral("widget"));
        widget->setGeometry(QRect(120, 70, 171, 91));
        verticalLayout = new QVBoxLayout(widget);
        verticalLayout->setSpacing(6);
        verticalLayout->setContentsMargins(11, 11, 11, 11);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        progressBar = new QProgressBar(widget);
        progressBar->setObjectName(QStringLiteral("progressBar"));
        progressBar->setValue(24);

        verticalLayout->addWidget(progressBar);

        horizontalSlider = new QSlider(widget);
        horizontalSlider->setObjectName(QStringLiteral("horizontalSlider"));
        horizontalSlider->setOrientation(Qt::Horizontal);

        verticalLayout->addWidget(horizontalSlider);

        SignalsSlots->setCentralWidget(centralWidget);
        menuBar = new QMenuBar(SignalsSlots);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 400, 22));
        SignalsSlots->setMenuBar(menuBar);
        mainToolBar = new QToolBar(SignalsSlots);
        mainToolBar->setObjectName(QStringLiteral("mainToolBar"));
        SignalsSlots->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(SignalsSlots);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        SignalsSlots->setStatusBar(statusBar);

        retranslateUi(SignalsSlots);

        QMetaObject::connectSlotsByName(SignalsSlots);
    } // setupUi

    void retranslateUi(QMainWindow *SignalsSlots)
    {
        SignalsSlots->setWindowTitle(QApplication::translate("SignalsSlots", "SignalsSlots", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class SignalsSlots: public Ui_SignalsSlots {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_SIGNALSSLOTS_H
