// _SQLGenerator_EOArchive_English.java
// Generated by EnterpriseObjects palette at Friday, October 8, 2004 6:12:34 PM US/Central

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _SQLGenerator_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOTextArea _nsTextView0, _nsTextView1;
    com.webobjects.eointerface.swing.EOView _nsBox0, _nsBox1, _nsSplitView0;
    javax.swing.JButton _nsButton0, _nsButton1;
    javax.swing.JCheckBox _nsButton2, _nsButton3, _nsButton4, _nsButton5, _nsButton6, _nsButton7, _nsButton8, _nsButton9;
    javax.swing.JPanel _nsView0;

    public _SQLGenerator_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsSplitView0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "errorText")) != null)) {
            _nsTextView1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextArea)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextView1");
        } else {
            _nsTextView1 = (com.webobjects.eointerface.swing.EOTextArea)_registered(new com.webobjects.eointerface.swing.EOTextArea(), "NSTextView");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "createPrimaryKeySupportCheck")) != null)) {
            _nsButton9 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton9");
        } else {
            _nsButton9 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Create Primary Key Support"), "NSButton414");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "dropPrimaryKeySupportCheck")) != null)) {
            _nsButton8 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton8");
        } else {
            _nsButton8 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Drop Primary Key Support"), "NSButton43");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "foreignKeyConstraintsCheck")) != null)) {
            _nsButton7 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton7");
        } else {
            _nsButton7 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Foreign Key Constraints"), "NSButton413");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "primaryKeyConstraintsCheck")) != null)) {
            _nsButton6 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton6");
        } else {
            _nsButton6 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Primary Key Constraints"), "NSButton412");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "createTablesCheck")) != null)) {
            _nsButton5 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton5");
        } else {
            _nsButton5 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Create Tables"), "NSButton411");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "dropTablesCheck")) != null)) {
            _nsButton4 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton4");
        } else {
            _nsButton4 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Drop Tables"), "NSButton42");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "createDatabaseCheck")) != null)) {
            _nsButton3 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton3");
        } else {
            _nsButton3 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Create Database"), "NSButton41");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "sqlText")) != null)) {
            _nsTextView0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextArea)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextView0");
        } else {
            _nsTextView0 = (com.webobjects.eointerface.swing.EOTextArea)_registered(new com.webobjects.eointerface.swing.EOTextArea(), "NSTextView");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "executeSQLButton")) != null)) {
            _nsButton1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton1");
        } else {
            _nsButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Execute SQL"), "NSButton1");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "saveAsButton")) != null)) {
            _nsButton0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton0");
        } else {
            _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Save As..."), "NSButton");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "dropDatabaseCheck")) != null)) {
            _nsButton2 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton2");
        } else {
            _nsButton2 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Drop Database"), "NSButton4");
        }

        _nsBox1 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSView");
        _nsBox0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSBox");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Window");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_eoFrame0, _owner(), "delegate");
        }

        if (_replacedObjects.objectForKey("_nsTextView1") == null) {
            _connect(_nsTextView1, _owner(), "delegate");
        }

        if (_replacedObjects.objectForKey("_nsTextView1") == null) {
            _connect(_owner(), _nsTextView1, "errorText");
        }

        _nsButton9.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton9), ""));

        if (_replacedObjects.objectForKey("_nsButton9") == null) {
            _connect(_owner(), _nsButton9, "createPrimaryKeySupportCheck");
        }

        _nsButton8.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton8), ""));

        if (_replacedObjects.objectForKey("_nsButton8") == null) {
            _connect(_owner(), _nsButton8, "dropPrimaryKeySupportCheck");
        }

        _nsButton7.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton7), ""));

        if (_replacedObjects.objectForKey("_nsButton7") == null) {
            _connect(_owner(), _nsButton7, "foreignKeyConstraintsCheck");
        }

        _nsButton6.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton6), ""));

        if (_replacedObjects.objectForKey("_nsButton6") == null) {
            _connect(_owner(), _nsButton6, "primaryKeyConstraintsCheck");
        }

        _nsButton5.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton5), ""));

        if (_replacedObjects.objectForKey("_nsButton5") == null) {
            _connect(_owner(), _nsButton5, "createTablesCheck");
        }

        _nsButton4.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton4), ""));

        if (_replacedObjects.objectForKey("_nsButton4") == null) {
            _connect(_owner(), _nsButton4, "dropTablesCheck");
        }

        _nsButton3.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton3), ""));

        if (_replacedObjects.objectForKey("_nsButton3") == null) {
            _connect(_owner(), _nsButton3, "createDatabaseCheck");
        }

        if (_replacedObjects.objectForKey("_nsButton2") == null) {
            _connect(_owner(), _nsButton2, "dropDatabaseCheck");
        }

        if (_replacedObjects.objectForKey("_nsTextView0") == null) {
            _connect(_nsTextView0, _owner(), "delegate");
        }

        if (_replacedObjects.objectForKey("_nsTextView0") == null) {
            _connect(_owner(), _nsTextView0, "sqlText");
        }

        _nsButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "executeSQL", _nsButton1), ""));

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _connect(_owner(), _nsButton1, "executeSQLButton");
        }

        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "saveAs", _nsButton0), ""));

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _connect(_owner(), _nsButton0, "saveAsButton");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }

        _nsButton2.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOptions", _nsButton2), ""));
    }

    protected void _init() {
        super._init();
        if (!(_nsSplitView0.getLayout() instanceof EOViewLayout)) { _nsSplitView0.setLayout(new EOViewLayout()); }
        _nsTextView0.setSize(435, 243);
        _nsTextView0.setLocation(0, 0);
        ((EOViewLayout)_nsSplitView0.getLayout()).setAutosizingMask(_nsTextView0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _nsSplitView0.add(_nsTextView0);
        _nsTextView1.setSize(435, 0);
        _nsTextView1.setLocation(0, 252);
        ((EOViewLayout)_nsSplitView0.getLayout()).setAutosizingMask(_nsTextView1, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _nsSplitView0.add(_nsTextView1);

        if (_replacedObjects.objectForKey("_nsTextView1") == null) {
            _nsTextView1.setEditable(false);
            _nsTextView1.setOpaque(true);
            _nsTextView1.setText("");
        }

        if (_replacedObjects.objectForKey("_nsButton9") == null) {
            _setFontForComponent(_nsButton9, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton8") == null) {
            _setFontForComponent(_nsButton8, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton7") == null) {
            _setFontForComponent(_nsButton7, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton6") == null) {
            _setFontForComponent(_nsButton6, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton5") == null) {
            _setFontForComponent(_nsButton5, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton4") == null) {
            _setFontForComponent(_nsButton4, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton3") == null) {
            _setFontForComponent(_nsButton3, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsTextView0") == null) {
            _nsTextView0.setEditable(false);
            _nsTextView0.setOpaque(true);
            _nsTextView0.setText("");
            _setFontForComponent(_nsTextView0.textArea(), "Monaco", 10, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsButton1") == null) {
            _setFontForComponent(_nsButton1, "Lucida Grande", 13, Font.PLAIN);
            _nsButton1.setMargin(new Insets(0, 2, 0, 2));
        }

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
            _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        }

        if (_replacedObjects.objectForKey("_nsButton2") == null) {
            _setFontForComponent(_nsButton2, "Lucida Grande", 13, Font.PLAIN);
        }

        if (!(_nsBox1.getLayout() instanceof EOViewLayout)) { _nsBox1.setLayout(new EOViewLayout()); }
        _nsButton2.setSize(116, 17);
        _nsButton2.setLocation(18, 19);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton2, EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton2);
        _nsButton3.setSize(126, 17);
        _nsButton3.setLocation(226, 19);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton3, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton3);
        _nsButton4.setSize(99, 17);
        _nsButton4.setLocation(18, 41);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton4, EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton4);
        _nsButton8.setSize(186, 17);
        _nsButton8.setLocation(18, 107);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton8, EOViewLayout.MaxXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton8);
        _nsButton5.setSize(109, 17);
        _nsButton5.setLocation(226, 41);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton5, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton5);
        _nsButton6.setSize(173, 17);
        _nsButton6.setLocation(226, 63);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton6, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton6);
        _nsButton7.setSize(173, 17);
        _nsButton7.setLocation(226, 85);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton7, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton7);
        _nsButton9.setSize(195, 17);
        _nsButton9.setLocation(226, 107);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsButton9, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsBox1.add(_nsButton9);
        if (!(_nsBox0.getLayout() instanceof EOViewLayout)) { _nsBox0.setLayout(new EOViewLayout()); }
        _nsBox1.setSize(437, 140);
        _nsBox1.setLocation(2, 18);
        ((EOViewLayout)_nsBox0.getLayout()).setAutosizingMask(_nsBox1, EOViewLayout.MinYMargin);
        _nsBox0.add(_nsBox1);
        _nsBox0.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("Options", true, "Lucida Grande", 13, Font.PLAIN));
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsBox0.setSize(441, 160);
        _nsBox0.setLocation(10, 6);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsBox0, EOViewLayout.WidthSizable | EOViewLayout.MaxYMargin);
        _nsView0.add(_nsBox0);
        _nsButton0.setSize(116, 26);
        _nsButton0.setLocation(336, 439);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);
        _nsButton1.setSize(116, 26);
        _nsButton1.setLocation(213, 439);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton1, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton1);
        _nsSplitView0.setSize(435, 252);
        _nsSplitView0.setLocation(13, 170);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsSplitView0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsSplitView0);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(461, 475);
            _eoFrame0.setTitle("SQL Generation");
            _eoFrame0.setLocation(330, 313);
            _eoFrame0.setSize(461, 475);
        }
    }
}
